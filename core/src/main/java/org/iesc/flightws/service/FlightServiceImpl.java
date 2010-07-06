package org.iesc.flightws.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.iesc.flightws.domain.Booking;
import org.iesc.flightws.domain.BookingImpl;
import org.iesc.flightws.domain.City;
import org.iesc.flightws.domain.CityImpl;
import org.iesc.flightws.domain.Flight;
import org.iesc.flightws.domain.FlightDate;
import org.iesc.flightws.domain.FlightImpl;
import org.iesc.flightws.domain.Passenger;
import org.iesc.flightws.domain.PassengerImpl;
import org.iesc.flightws.domain.Plane;
import org.iesc.flightws.domain.PlaneImpl;
import org.iesc.flightws.domain.Price;
import org.iesc.flightws.domain.PriceImpl;
import org.iesc.flightws.vo.BookingVO;
import org.iesc.flightws.vo.CityVO;
import org.iesc.flightws.vo.FlightDateVO;
import org.iesc.flightws.vo.FlightSearchCriteriaVO;
import org.iesc.flightws.vo.FlightSearchResultsVO;
import org.iesc.flightws.vo.FlightVO;
import org.iesc.flightws.vo.PassengerVO;

/**
 * Main webservice implementation.
 */
public class FlightServiceImpl extends FlightServiceBase {

    protected FlightSearchResultsVO handleGetFlightsByCriteria(FlightSearchCriteriaVO searchCriteria) throws Exception {
        FlightSearchResultsVO result = new FlightSearchResultsVO();

        if (searchCriteria.getDepartureDate() == null) {
            // If null, replace by current day
            searchCriteria.setDepartureDate(new java.util.Date().getTime());
        }

        List<FlightDate> flightDatesCol = (List<FlightDate>) getFlightDateDao().getFlightDatesByCriteria(searchCriteria);
        result.setResults(computeFlightVOs(flightDatesCol));

        return result;
    }

    private FlightVO[] computeFlightVOs(List<FlightDate> flightDatesCol) {
        FlightVO[] result = null;
        List<FlightVO> resultCol = new ArrayList<FlightVO>();

        Map<Long, List<FlightDateVO>> flightsMap = new HashMap<Long, List<FlightDateVO>>();

        for (FlightDate fd : flightDatesCol) {
            if (flightsMap.containsKey(fd.getFlight().getId())) {
                // append this fd to the existing flight id
                flightsMap.get(fd.getFlight().getId()).add(getFlightDateDao().toFlightDateVO(fd));
            } else {
                // create a new flight
                List<FlightDateVO> newList = new ArrayList<FlightDateVO>();
                // append this fd to the newly added flight id
                newList.add(getFlightDateDao().toFlightDateVO(fd));
                flightsMap.put(fd.getFlight().getId(), newList);
            }
        }

        Flight flight = null;
        FlightVO flightVO = null;
        for (Long flightId : flightsMap.keySet()) {
            // Create a new FlightVO for each flightId
            flight = getFlightDao().load(flightId);
            flightVO = new FlightVO();

            flightVO.setId(flight.getId());
            flightVO.setCode(flight.getCode());
            flightVO.setDepartureCity(getCityDao().toCityVO(flight.getDepartureCity()));
            flightVO.setDestinationCity(getCityDao().toCityVO(flight.getDestinationCity()));

            flightVO.setFlightDates((FlightDateVO[]) (flightsMap.get(flightId).toArray(new FlightDateVO[flightsMap.get(flightId).size()])));

            resultCol.add(flightVO);
        }

        result = (FlightVO[]) resultCol.toArray(new FlightVO[resultCol.size()]);

        return result;
    }

    protected Long handleCreateBooking(BookingVO bookingVO) throws Exception {
        Long result = null;

        // Save all the passengers
        Collection<Passenger> passengers = new HashSet<Passenger>();
        Passenger passenger = null;
        for (PassengerVO passengerVO : bookingVO.getPassengers()) {
            passenger = PassengerImpl.Factory.newInstance();
            getPassengerDao().passengerVOToEntity(passengerVO, passenger, true);
            passengers.add(passenger);
        }
        getPassengerDao().create(passengers);

        // Save the booking
        Booking booking = BookingImpl.Factory.newInstance();
        booking.setFlightDate(getFlightDateDao().load(bookingVO.getFlightDateId()));
        booking.setUser(getUserDao().load(bookingVO.getUserId()));
        booking.setPassengers(passengers);
        getBookingDao().create(booking);

        return result;
    }

    protected CityVO[] handleGetDestinationCitiesByDepartureCity(CityVO departureCity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected void handleGenerateTestData(Long complexity) throws Exception {
        City city1 = CityImpl.Factory.newInstance("Bucharest", "BBU");
        City city2 = CityImpl.Factory.newInstance("Paris", "CDG");
        City city3 = CityImpl.Factory.newInstance("Barcelona", "BCN");
        City city4 = CityImpl.Factory.newInstance("Munich", "AGB");
        City city5 = CityImpl.Factory.newInstance("Geneve", "GVA");
        List<City> cities = new ArrayList<City>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        getCityDao().create(cities);

        Plane boeing = PlaneImpl.Factory.newInstance("Boeing 747", 100L);
        Plane airbus = PlaneImpl.Factory.newInstance("Airbus A380", 400L);
        List<Plane> planes = new ArrayList<Plane>();
        planes.add(boeing);
        planes.add(airbus);
        getPlaneDao().create(planes);

        Calendar calendar = GregorianCalendar.getInstance();

        Flight flight1 = FlightImpl.Factory.newInstance("WD 701", city1, city2);
        {
            calendar.set(Calendar.MONTH, 6);
            calendar.set(Calendar.DAY_OF_MONTH, 1);

            List<Price> prices1 = new ArrayList<Price>();
            Price price1_1 = PriceImpl.Factory.newInstance(1L, 100D, null);
            Price price1_2 = PriceImpl.Factory.newInstance(2L, 80D, null);
            Price price1_3 = PriceImpl.Factory.newInstance(3L, 20D, null);
            prices1.add(price1_1);
            prices1.add(price1_2);
            prices1.add(price1_3);
            getPriceDao().create(prices1);

            FlightDate fligthDate = FlightDate.Factory.newInstance(
                    new java.sql.Timestamp(calendar.getTimeInMillis()),
                    new java.sql.Timestamp(calendar.getTimeInMillis()),
                    flight1,
                    prices1,
                    boeing);
            getFlightDateDao().create(fligthDate);
        }

    }
}
