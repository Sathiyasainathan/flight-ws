package org.iesc.flightws.domain;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.iesc.flightws.vo.FlightSearchCriteriaVO;
import org.iesc.flightws.vo.FlightVO;

/**
 * 
 */
public class FlightDaoImpl extends FlightDaoBase {

     private final Logger LOGGER = Logger.getLogger(this.getClass());

    protected List<Flight> handleGetFlightsByCriteria(FlightSearchCriteriaVO searchCriteria) throws Exception {
        List<Flight> result = new ArrayList<Flight>();

        try {
            StringBuilder hql = new StringBuilder();
            hql.append("select f \n");
            hql.append("from \n");
            hql.append("FlightImpl f \n");
            hql.append(" \n");
            hql.append(" \n");
            hql.append(" \n");
            hql.append(" \n");
            hql.append(" \n");
            
            final org.hibernate.Query query = this.getSession(false).createQuery(hql.toString());
            result = (List<Flight>)query.list();

        } catch (Exception ex) {
            LOGGER.error("Exception while executing FlightDao.getFlightsByCriteria()", ex);
        }

        return result;
    }

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
