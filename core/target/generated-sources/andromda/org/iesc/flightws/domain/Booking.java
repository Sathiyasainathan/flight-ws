// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package org.iesc.flightws.domain;

/**
 * 
 */
public abstract class Booking
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 8513098770144068861L;

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

    private org.iesc.flightws.domain.User user;

    /**
     * 
     */
    public org.iesc.flightws.domain.User getUser()
    {
        return this.user;
    }

    public void setUser(org.iesc.flightws.domain.User user)
    {
        this.user = user;
    }

    private org.iesc.flightws.domain.FlightDate flightDate;

    /**
     * 
     */
    public org.iesc.flightws.domain.FlightDate getFlightDate()
    {
        return this.flightDate;
    }

    public void setFlightDate(org.iesc.flightws.domain.FlightDate flightDate)
    {
        this.flightDate = flightDate;
    }

    private java.util.Collection passengers = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getPassengers()
    {
        return this.passengers;
    }

    public void setPassengers(java.util.Collection passengers)
    {
        this.passengers = passengers;
    }

    /**
     * Returns <code>true</code> if the argument is an Booking instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Booking))
        {
            return false;
        }
        final Booking that = (Booking)object;
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
     * Constructs new instances of {@link org.iesc.flightws.domain.Booking}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.Booking}.
         */
        public static org.iesc.flightws.domain.Booking newInstance()
        {
            return new org.iesc.flightws.domain.BookingImpl();
        }


        /**
         * Constructs a new instance of {@link org.iesc.flightws.domain.Booking}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static org.iesc.flightws.domain.Booking newInstance(org.iesc.flightws.domain.User user, org.iesc.flightws.domain.FlightDate flightDate, java.util.Collection passengers)
        {
            final org.iesc.flightws.domain.Booking entity = new org.iesc.flightws.domain.BookingImpl();
            entity.setUser(user);
            entity.setFlightDate(flightDate);
            entity.setPassengers(passengers);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}