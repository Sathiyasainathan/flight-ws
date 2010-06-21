package org.iesc.flightws.domain;

import org.apache.log4j.Logger;
import org.iesc.flightws.vo.FlightVO;

/**
 * 
 */
public class FlightDaoImpl extends FlightDaoBase {

    private final Logger LOGGER = Logger.getLogger(FlightDaoImpl.class);

    public void toFlightVO(Flight source, FlightVO target) {
        super.toFlightVO(source, target);
        // WARNING! No conversion for target.destinationCity (can't convert source.getDestinationCity():org.iesc.flightws.domain.City to org.iesc.flightws.vo.CityVO
        // WARNING! No conversion for target.departureCity (can't convert source.getDepartureCity():org.iesc.flightws.domain.City to org.iesc.flightws.vo.CityVO
    }

    public FlightVO toFlightVO(final Flight entity) {
        return super.toFlightVO(entity);
    }

    public Flight flightVOToEntity(FlightVO flightVO) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
