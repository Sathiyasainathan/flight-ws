package org.iesc.flightws.service;

import java.util.List;
import org.iesc.flightws.domain.Flight;
import org.iesc.flightws.vo.BookingVO;
import org.iesc.flightws.vo.CityVO;
import org.iesc.flightws.vo.FlightSearchCriteriaVO;
import org.iesc.flightws.vo.FlightSearchResultsVO;
import org.iesc.flightws.vo.FlightVO;

/**
 * Main webservice implementation.
 */
public class FlightServiceImpl extends FlightServiceBase {

    protected FlightSearchResultsVO handleGetFlightsByCriteria(FlightSearchCriteriaVO searchCriteria) throws Exception {
        FlightSearchResultsVO result = new FlightSearchResultsVO();
        FlightVO[] results = null;

        List<Flight> flightsCol = (List<Flight>)getFlightDao().getFlightsByCriteria(searchCriteria);
        results = getFlightDao().toFlightVOArray(flightsCol);
        result.setResults(results);

        return result;
    }

    protected Long handleCreateBooking(BookingVO booking) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected CityVO[] handleGetDestinationCitiesByDepartureCity(CityVO departureCity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
