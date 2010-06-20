// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.iesc.flightws.domain;
/**
 * @see org.iesc.flightws.domain.Booking
 */
public class BookingDaoImpl
    extends org.iesc.flightws.domain.BookingDaoBase
{
    /**
     * @see org.iesc.flightws.domain.BookingDao#toBookingVO(org.iesc.flightws.domain.Booking, org.iesc.flightws.vo.BookingVO)
     */
    public void toBookingVO(
        org.iesc.flightws.domain.Booking source,
        org.iesc.flightws.vo.BookingVO target)
    {
        // @todo verify behavior of toBookingVO
        super.toBookingVO(source, target);
        // WARNING! No conversion for target.user (can't convert source.getUser():org.iesc.flightws.domain.User to org.iesc.flightws.vo.UserVO
        // WARNING! No conversion for target.flightDates (can't convert source.getFlightDates():org.iesc.flightws.domain.FlightDate to org.iesc.flightws.vo.FlightDateVO[]
        // WARNING! No conversion for target.passengers (can't convert source.getPassengers():org.iesc.flightws.domain.Passenger to org.iesc.flightws.vo.PassengerVO[]
    }


    /**
     * @see org.iesc.flightws.domain.BookingDao#toBookingVO(org.iesc.flightws.domain.Booking)
     */
    public org.iesc.flightws.vo.BookingVO toBookingVO(final org.iesc.flightws.domain.Booking entity)
    {
        // @todo verify behavior of toBookingVO
        return super.toBookingVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private org.iesc.flightws.domain.Booking loadBookingFromBookingVO(org.iesc.flightws.vo.BookingVO bookingVO)
    {
        // @todo implement loadBookingFromBookingVO
        throw new java.lang.UnsupportedOperationException("org.iesc.flightws.domain.loadBookingFromBookingVO(org.iesc.flightws.vo.BookingVO) not yet implemented.");

        /* A typical implementation looks like this:
        org.iesc.flightws.domain.Booking booking = this.load(bookingVO.getId());
        if (booking == null)
        {
            booking = org.iesc.flightws.domain.Booking.Factory.newInstance();
        }
        return booking;
        */
    }

    
    /**
     * @see org.iesc.flightws.domain.BookingDao#bookingVOToEntity(org.iesc.flightws.vo.BookingVO)
     */
    public org.iesc.flightws.domain.Booking bookingVOToEntity(org.iesc.flightws.vo.BookingVO bookingVO)
    {
        // @todo verify behavior of bookingVOToEntity
        org.iesc.flightws.domain.Booking entity = this.loadBookingFromBookingVO(bookingVO);
        this.bookingVOToEntity(bookingVO, entity, true);
        return entity;
    }


    /**
     * @see org.iesc.flightws.domain.BookingDao#bookingVOToEntity(org.iesc.flightws.vo.BookingVO, org.iesc.flightws.domain.Booking)
     */
    public void bookingVOToEntity(
        org.iesc.flightws.vo.BookingVO source,
        org.iesc.flightws.domain.Booking target,
        boolean copyIfNull)
    {
        // @todo verify behavior of bookingVOToEntity
        super.bookingVOToEntity(source, target, copyIfNull);
    }

}