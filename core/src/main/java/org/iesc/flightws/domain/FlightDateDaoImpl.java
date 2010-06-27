package org.iesc.flightws.domain;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.iesc.flightws.vo.FlightDateVO;
import org.iesc.flightws.vo.FlightSearchCriteriaVO;

public class FlightDateDaoImpl extends FlightDateDaoBase {

    private final Logger LOGGER = Logger.getLogger(FlightDateDaoImpl.class);

    protected List<FlightDate> handleGetFlightDatesByCriteria(FlightSearchCriteriaVO searchCriteria) throws Exception {
        List<FlightDate> result = new ArrayList<FlightDate>();

        boolean computeArrivalCity = false;
        boolean computeDepartureDate = false;
        boolean computeDepartureDateMax = false;

        try {
            StringBuilder hql = new StringBuilder();
            hql.append("select fd \n");
            hql.append("from \n");
            hql.append("FlightImpl f, \n");
            hql.append("FlightDateImpl fd \n");
            hql.append("where \n");
            hql.append("fd.flight = f.id and \n");
            // filter - departureCity
            hql.append("f.departureCity.id = :departureCityFk \n");

            // filter - arrivalCity
            if (searchCriteria.getArrivalCity() != null) {
                hql.append("and f.destinationCity.id = :arrivalCityFk \n");
                computeArrivalCity = true;
            }

            // filter - departureDate
            if (searchCriteria.getDepartureDate() != null) {
                hql.append("and fd.departureDate >= :departureDate \n");
                computeDepartureDate = true;
            }

            // filter - departureDate
            if (searchCriteria.getDepartureDateMax() != null) {
                hql.append("and fd.departureDate <= :departureDateMax \n");
                computeDepartureDateMax = true;
            }

            // order - default by FlightDate.departureDate
            hql.append("order by fd.departureDate");

            final org.hibernate.Query query = this.getSession(false).createQuery(hql.toString());
            query.setParameter("departureCityFk", searchCriteria.getDepartureCity());

            if (computeArrivalCity) {
                query.setParameter("arrivalCityFk", searchCriteria.getArrivalCity());
            }
            if (computeDepartureDate) {
                query.setParameter("departureDate", new java.sql.Timestamp(searchCriteria.getDepartureDate()));
            }
            if (computeDepartureDateMax) {
                query.setParameter("departureDateMax", new java.sql.Timestamp(searchCriteria.getDepartureDateMax()));
            }
            
            result = (List<FlightDate>) query.list();

        } catch (Exception ex) {
            LOGGER.error("Exception while executing FlightDateDao.getFlightDatessByCriteria()", ex);
        }

        return result;
    }

    public FlightDate flightDateVOToEntity(FlightDateVO flightDateVO) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final FlightDateVO toFlightDateVO(final FlightDate entity) {
        FlightDateVO flightDateVO = new FlightDateVO();

        flightDateVO.setPlane(getPlaneDao().toPlaneVO(entity.getPlane()));
        flightDateVO.setDepartureDate(entity.getDepartureDate().getTime());
        flightDateVO.setArrivalDate(entity.getArrivalDate().getTime());

        return flightDateVO;
    }
}
