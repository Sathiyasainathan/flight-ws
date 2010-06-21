package org.iesc.flightws.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.iesc.flightws.domain.Flight;
import org.iesc.flightws.domain.FlightDate;
import org.iesc.flightws.vo.BookingVO;
import org.iesc.flightws.vo.CityVO;
import org.iesc.flightws.vo.FlightDateVO;
import org.iesc.flightws.vo.FlightSearchCriteriaVO;
import org.iesc.flightws.vo.FlightSearchResultsVO;
import org.iesc.flightws.vo.FlightVO;

/**
 * Main webservice implementation.
 */
public class FlightServiceImpl extends FlightServiceBase {

    protected FlightSearchResultsVO handleGetFlightsByCriteria(FlightSearchCriteriaVO searchCriteria) throws Exception {
        FlightSearchResultsVO result = new FlightSearchResultsVO();
        //1. departureCity
        // no special treatment
        //2. arrivalCity
        // no special treatment
        //3. departureDate
        if(searchCriteria.getDepartureDate() == null) {
            // If null, replace by current day
            searchCriteria.setDepartureDate(new java.util.Date().getTime());
        }

        //4. arrivalDate
        // no special treatment

        //5. nrPassengers
        //TODO: If plane involved in a flight date is fully booked, that flight date must not be returned

        List<FlightDate> flightDatesCol = (List<FlightDate>)getFlightDateDao().getFlightDatesByCriteria(searchCriteria);
        
        result.setResults( computeFlightVOs(flightDatesCol) );
        //6. flightType
        // If flightType = FlightConstants.ONE_WAY the system performs only one search
        //
        // If flightType = FlightConstants.ROUND_TRIP the system performs 2 searches by inversing
        // the departureCity with the arrivalCity and
        // the departureDate with the arrivalDate
        // and concatenates the results.

        //TODO: add here the inversed search

        

        return result;
    }

    private FlightVO[] computeFlightVOs(List<FlightDate> flightDatesCol) {
        FlightVO[] result = null;
        List<FlightVO> resultCol = new ArrayList<FlightVO>();

        Map<Long, List<FlightDateVO>> flightsMap = new HashMap<Long, List<FlightDateVO>>();

        for(FlightDate fd : flightDatesCol) {
            if( flightsMap.containsKey(fd.getFlight().getId()) ) {
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
        for(Long flightId : flightsMap.keySet()) {
            flight = getFlightDao().load(flightId);
            flightVO = new FlightVO();

            flightVO.setId(flight.getId());
            flightVO.setCode(flight.getCode());
            flightVO.setDepartureCity(getCityDao().toCityVO(flight.getDepartureCity()));
            flightVO.setDestinationCity(getCityDao().toCityVO(flight.getDestinationCity()));

            flightVO.setFlightDates( (FlightDateVO[])(flightsMap.get(flightId).toArray(new FlightDateVO[flightsMap.get(flightId).size()])) );

            resultCol.add(flightVO);
        }

        result = (FlightVO[])resultCol.toArray(new FlightVO[resultCol.size()]);

        return result;
    }

    protected Long handleCreateBooking(BookingVO booking) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected CityVO[] handleGetDestinationCitiesByDepartureCity(CityVO departureCity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
