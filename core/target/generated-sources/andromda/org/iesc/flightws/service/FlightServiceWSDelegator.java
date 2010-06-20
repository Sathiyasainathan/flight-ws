// license-header java merge-point
package org.iesc.flightws.service;

/**
 * Web service delegator for {@link org.iesc.flightws.service.FlightService}.
 *
 * @see org.iesc.flightws.service.FlightService
 */
public class FlightServiceWSDelegator
{
	private String beanRefFactory;
	
    public String getBeanRefFactory() {
		return beanRefFactory;
	}

	public void setBeanRefFactory(String beanRefFactory) {
		this.beanRefFactory = beanRefFactory;
	}

    /**
     * Gets an instance of {@link org.iesc.flightws.service.FlightService}
     */
    private final org.iesc.flightws.service.FlightService getFlightService()
    {
		org.iesc.flightws.ServiceLocator serviceLocator = org.iesc.flightws.ServiceLocator.instance();
    	if(getBeanRefFactory() != null) {
    		serviceLocator.init(getBeanRefFactory());
    	}
        return serviceLocator.getFlightService();
    }

    /**
     * @see org.iesc.flightws.service.FlightService#getFlightsByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO)
     */
    public org.iesc.flightws.vo.FlightSearchResultsVO getFlightsByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO searchCriteria)
    {
        try
        {
            return getFlightService().getFlightsByCriteria(searchCriteria);
        }
        catch (Exception exception)
        {
            final Throwable cause = getRootCause(exception);
            throw new java.lang.RuntimeException(cause);
        }
    }

    /**
     * @see org.iesc.flightws.service.FlightService#createBooking(org.iesc.flightws.vo.BookingVO)
     */
    public java.lang.Long createBooking(org.iesc.flightws.vo.BookingVO booking)
    {
        try
        {
            return getFlightService().createBooking(booking);
        }
        catch (Exception exception)
        {
            final Throwable cause = getRootCause(exception);
            throw new java.lang.RuntimeException(cause);
        }
    }

    /**
     * @see org.iesc.flightws.service.FlightService#getDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO)
     */
    public org.iesc.flightws.vo.CityVO[] getDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO departureCity)
    {
        try
        {
            return getFlightService().getDestinationCitiesByDepartureCity(departureCity);
        }
        catch (Exception exception)
        {
            final Throwable cause = getRootCause(exception);
            throw new java.lang.RuntimeException(cause);
        }
    }

    /**
     * Finds the root cause of the parent exception
     * by traveling up the exception tree.
     */
    private static Throwable getRootCause(Throwable throwable)
    {
        if (throwable != null)
        {
            // Reflectively get any exception causes.
            try
            {
                Throwable targetException = null;

                // java.lang.reflect.InvocationTargetException
                String exceptionProperty = "targetException";
                if (org.apache.commons.beanutils.PropertyUtils.isReadable(throwable, exceptionProperty))
                {
                    targetException = (Throwable)org.apache.commons.beanutils.PropertyUtils.getProperty(throwable, exceptionProperty);
                }
                else
                {
                    exceptionProperty = "causedByException";
                    //javax.ejb.EJBException
                    if (org.apache.commons.beanutils.PropertyUtils.isReadable(throwable, exceptionProperty))
                    {
                        targetException = (Throwable)org.apache.commons.beanutils.PropertyUtils.getProperty(throwable, exceptionProperty);
                    }
                }
                if (targetException != null)
                {
                    throwable = targetException;
                }
            }
            catch (Exception exception)
            {
                // just print the exception and continue
                exception.printStackTrace();
            }
            if (throwable.getCause() != null)
            {
                throwable = throwable.getCause();
                throwable = getRootCause(throwable);
            }
        }
        return throwable;
    }
}