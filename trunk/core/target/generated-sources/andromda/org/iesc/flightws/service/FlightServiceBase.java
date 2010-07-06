// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package org.iesc.flightws.service;

/**
 * <p>
 * Spring Service base class for <code>org.iesc.flightws.service.FlightService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see org.iesc.flightws.service.FlightService
 */
public abstract class FlightServiceBase
    implements org.iesc.flightws.service.FlightService
{

    private org.iesc.flightws.domain.FlightDateDao flightDateDao;

    /**
     * Sets the reference to <code>flightDate</code>'s DAO.
     */
    public void setFlightDateDao(org.iesc.flightws.domain.FlightDateDao flightDateDao)
    {
        this.flightDateDao = flightDateDao;
    }

    /**
     * Gets the reference to <code>flightDate</code>'s DAO.
     */
    protected org.iesc.flightws.domain.FlightDateDao getFlightDateDao()
    {
        return this.flightDateDao;
    }

    private org.iesc.flightws.domain.UserDao userDao;

    /**
     * Sets the reference to <code>user</code>'s DAO.
     */
    public void setUserDao(org.iesc.flightws.domain.UserDao userDao)
    {
        this.userDao = userDao;
    }

    /**
     * Gets the reference to <code>user</code>'s DAO.
     */
    protected org.iesc.flightws.domain.UserDao getUserDao()
    {
        return this.userDao;
    }

    private org.iesc.flightws.domain.PassengerDao passengerDao;

    /**
     * Sets the reference to <code>passenger</code>'s DAO.
     */
    public void setPassengerDao(org.iesc.flightws.domain.PassengerDao passengerDao)
    {
        this.passengerDao = passengerDao;
    }

    /**
     * Gets the reference to <code>passenger</code>'s DAO.
     */
    protected org.iesc.flightws.domain.PassengerDao getPassengerDao()
    {
        return this.passengerDao;
    }

    private org.iesc.flightws.domain.PlaneDao planeDao;

    /**
     * Sets the reference to <code>plane</code>'s DAO.
     */
    public void setPlaneDao(org.iesc.flightws.domain.PlaneDao planeDao)
    {
        this.planeDao = planeDao;
    }

    /**
     * Gets the reference to <code>plane</code>'s DAO.
     */
    protected org.iesc.flightws.domain.PlaneDao getPlaneDao()
    {
        return this.planeDao;
    }

    private org.iesc.flightws.domain.CityDao cityDao;

    /**
     * Sets the reference to <code>city</code>'s DAO.
     */
    public void setCityDao(org.iesc.flightws.domain.CityDao cityDao)
    {
        this.cityDao = cityDao;
    }

    /**
     * Gets the reference to <code>city</code>'s DAO.
     */
    protected org.iesc.flightws.domain.CityDao getCityDao()
    {
        return this.cityDao;
    }

    private org.iesc.flightws.domain.PriceDao priceDao;

    /**
     * Sets the reference to <code>price</code>'s DAO.
     */
    public void setPriceDao(org.iesc.flightws.domain.PriceDao priceDao)
    {
        this.priceDao = priceDao;
    }

    /**
     * Gets the reference to <code>price</code>'s DAO.
     */
    protected org.iesc.flightws.domain.PriceDao getPriceDao()
    {
        return this.priceDao;
    }

    private org.iesc.flightws.domain.FlightDao flightDao;

    /**
     * Sets the reference to <code>flight</code>'s DAO.
     */
    public void setFlightDao(org.iesc.flightws.domain.FlightDao flightDao)
    {
        this.flightDao = flightDao;
    }

    /**
     * Gets the reference to <code>flight</code>'s DAO.
     */
    protected org.iesc.flightws.domain.FlightDao getFlightDao()
    {
        return this.flightDao;
    }

    private org.iesc.flightws.domain.BookingDao bookingDao;

    /**
     * Sets the reference to <code>booking</code>'s DAO.
     */
    public void setBookingDao(org.iesc.flightws.domain.BookingDao bookingDao)
    {
        this.bookingDao = bookingDao;
    }

    /**
     * Gets the reference to <code>booking</code>'s DAO.
     */
    protected org.iesc.flightws.domain.BookingDao getBookingDao()
    {
        return this.bookingDao;
    }

    /**
     * @see org.iesc.flightws.service.FlightService#getFlightsByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO)
     */
    public org.iesc.flightws.vo.FlightSearchResultsVO getFlightsByCriteria(final org.iesc.flightws.vo.FlightSearchCriteriaVO searchCriteria)
    {
        if (searchCriteria == null)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.getFlightsByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO searchCriteria) - 'searchCriteria' can not be null");
        }
        if (searchCriteria.getDepartureCity() == null)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.getFlightsByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO searchCriteria) - 'searchCriteria.departureCity' can not be null");
        }
        try
        {
            return this.handleGetFlightsByCriteria(searchCriteria);
        }
        catch (Throwable th)
        {
            throw new org.iesc.flightws.service.FlightServiceException(
                "Error performing 'org.iesc.flightws.service.FlightService.getFlightsByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO searchCriteria)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #getFlightsByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO)}
      */
    protected abstract org.iesc.flightws.vo.FlightSearchResultsVO handleGetFlightsByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO searchCriteria)
        throws java.lang.Exception;

    /**
     * @see org.iesc.flightws.service.FlightService#createBooking(org.iesc.flightws.vo.BookingVO)
     */
    public java.lang.Long createBooking(final org.iesc.flightws.vo.BookingVO booking)
    {
        if (booking == null)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.createBooking(org.iesc.flightws.vo.BookingVO booking) - 'booking' can not be null");
        }
        if (booking.getUserId() == null)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.createBooking(org.iesc.flightws.vo.BookingVO booking) - 'booking.userId' can not be null");
        }
        if (booking.getFlightDateId() == null)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.createBooking(org.iesc.flightws.vo.BookingVO booking) - 'booking.flightDateId' can not be null");
        }
        if (booking.getPassengers() == null)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.createBooking(org.iesc.flightws.vo.BookingVO booking) - 'booking.passengers' can not be null");
        }
        try
        {
            return this.handleCreateBooking(booking);
        }
        catch (Throwable th)
        {
            throw new org.iesc.flightws.service.FlightServiceException(
                "Error performing 'org.iesc.flightws.service.FlightService.createBooking(org.iesc.flightws.vo.BookingVO booking)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #createBooking(org.iesc.flightws.vo.BookingVO)}
      */
    protected abstract java.lang.Long handleCreateBooking(org.iesc.flightws.vo.BookingVO booking)
        throws java.lang.Exception;

    /**
     * @see org.iesc.flightws.service.FlightService#getDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO)
     */
    public org.iesc.flightws.vo.CityVO[] getDestinationCitiesByDepartureCity(final org.iesc.flightws.vo.CityVO departureCity)
    {
        if (departureCity == null)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.getDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO departureCity) - 'departureCity' can not be null");
        }
        if (departureCity.getName() == null || departureCity.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.getDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO departureCity) - 'departureCity.name' can not be null or empty");
        }
        if (departureCity.getCodeIATA() == null || departureCity.getCodeIATA().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.getDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO departureCity) - 'departureCity.codeIATA' can not be null or empty");
        }
        try
        {
            return this.handleGetDestinationCitiesByDepartureCity(departureCity);
        }
        catch (Throwable th)
        {
            throw new org.iesc.flightws.service.FlightServiceException(
                "Error performing 'org.iesc.flightws.service.FlightService.getDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO departureCity)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #getDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO)}
      */
    protected abstract org.iesc.flightws.vo.CityVO[] handleGetDestinationCitiesByDepartureCity(org.iesc.flightws.vo.CityVO departureCity)
        throws java.lang.Exception;

    /**
     * @see org.iesc.flightws.service.FlightService#generateTestData(java.lang.Long)
     */
    public void generateTestData(final java.lang.Long complexity)
    {
        if (complexity == null)
        {
            throw new IllegalArgumentException(
                "org.iesc.flightws.service.FlightService.generateTestData(java.lang.Long complexity) - 'complexity' can not be null");
        }
        try
        {
            this.handleGenerateTestData(complexity);
        }
        catch (Throwable th)
        {
            throw new org.iesc.flightws.service.FlightServiceException(
                "Error performing 'org.iesc.flightws.service.FlightService.generateTestData(java.lang.Long complexity)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #generateTestData(java.lang.Long)}
      */
    protected abstract void handleGenerateTestData(java.lang.Long complexity)
        throws java.lang.Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return org.iesc.flightws.PrincipalStore.get();
    }

    /**
     * Gets the message source available to this service.
     */
    protected org.springframework.context.MessageSource getMessages()
    {
        return (org.springframework.context.MessageSource)
            org.iesc.flightws.BeanLocator.instance().getBean("messageSource");
    }

    /**
     * Gets the message having the given <code>key</code> in the underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     */
    protected String getMessage(final String key)
    {
        return this.getMessages().getMessage(key, null, null);
    }

    /**
     * Gets the message having the given <code>key</code> and <code>arguments</code> in the
     * underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     */
    protected String getMessage(final String key, final Object[] arguments)
    {
        return this.getMessages().getMessage(key, arguments, null);
    }

    /**
     * Gets the message having the given <code>key</code> using the given <code>arguments</code>
     * for the given <code>locale</code>.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     * @param locale the locale of the messages to retrieve.
     */
    protected String getMessage(
        final java.lang.String key, final java.lang.Object[] arguments,
        final java.util.Locale locale)
    {
        return this.getMessages().getMessage(key, arguments, locale);
    }

}