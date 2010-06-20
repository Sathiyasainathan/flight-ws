// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package org.iesc.flightws.domain;

/**
 * 
 */
public abstract class Flight
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -3043225863133052016L;

    private java.lang.String code;

    /**
     * 
     */
    public java.lang.String getCode()
    {
        return this.code;
    }

    public void setCode(java.lang.String code)
    {
        this.code = code;
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private org.iesc.flightws.domain.City departureCity;

    /**
     * 
     */
    public org.iesc.flightws.domain.City getDepartureCity()
    {
        return this.departureCity;
    }

    public void setDepartureCity(org.iesc.flightws.domain.City departureCity)
    {
        this.departureCity = departureCity;
    }

    private org.iesc.flightws.domain.City destinationCity;

    /**
     * 
     */
    public org.iesc.flightws.domain.City getDestinationCity()
    {
        return this.destinationCity;
    }

    public void setDestinationCity(org.iesc.flightws.domain.City destinationCity)
    {
        this.destinationCity = destinationCity;
    }

    private java.util.Collection departureDates = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getDepartureDates()
    {
        return this.departureDates;
    }

    public void setDepartureDates(java.util.Collection departureDates)
    {
        this.departureDates = departureDates;
    }

    /**
     * Returns <code>true</code> if the argument is an Flight instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Flight))
        {
            return false;
        }
        final Flight that = (Flight)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link org.iesc.flightws.domain.Flight}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.Flight}.
         */
        public static org.iesc.flightws.domain.Flight newInstance()
        {
            return new org.iesc.flightws.domain.FlightImpl();
        }

        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.Flight}, taking all required and/or
         * read-only properties as arguments.
         */
        public static org.iesc.flightws.domain.Flight newInstance(java.lang.String code, org.iesc.flightws.domain.City departureCity, org.iesc.flightws.domain.City destinationCity)
        {
            final org.iesc.flightws.domain.Flight entity = new org.iesc.flightws.domain.FlightImpl();
            entity.setCode(code);
            entity.setDepartureCity(departureCity);
            entity.setDestinationCity(destinationCity);
            return entity;
        }

        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.Flight}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static org.iesc.flightws.domain.Flight newInstance(java.lang.String code, org.iesc.flightws.domain.City departureCity, org.iesc.flightws.domain.City destinationCity, java.util.Collection departureDates)
        {
            final org.iesc.flightws.domain.Flight entity = new org.iesc.flightws.domain.FlightImpl();
            entity.setCode(code);
            entity.setDepartureCity(departureCity);
            entity.setDestinationCity(destinationCity);
            entity.setDepartureDates(departureDates);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}