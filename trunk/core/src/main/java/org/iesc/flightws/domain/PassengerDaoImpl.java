// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.iesc.flightws.domain;

/**
 * @see org.iesc.flightws.domain.Passenger
 */
public class PassengerDaoImpl
        extends org.iesc.flightws.domain.PassengerDaoBase {

    /**
     * @see org.iesc.flightws.domain.PassengerDao#toPassengerVO(org.iesc.flightws.domain.Passenger, org.iesc.flightws.vo.PassengerVO)
     */
    public void toPassengerVO(
            org.iesc.flightws.domain.Passenger source,
            org.iesc.flightws.vo.PassengerVO target) {
        // @todo verify behavior of toPassengerVO
        super.toPassengerVO(source, target);
    }

    /**
     * @see org.iesc.flightws.domain.PassengerDao#toPassengerVO(org.iesc.flightws.domain.Passenger)
     */
    public org.iesc.flightws.vo.PassengerVO toPassengerVO(final org.iesc.flightws.domain.Passenger entity) {
        // @todo verify behavior of toPassengerVO
        return super.toPassengerVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private org.iesc.flightws.domain.Passenger loadPassengerFromPassengerVO(org.iesc.flightws.vo.PassengerVO passengerVO) {
        org.iesc.flightws.domain.Passenger passenger = this.load(passengerVO.getId());
        if (passenger == null) {
            passenger = org.iesc.flightws.domain.Passenger.Factory.newInstance();
        }
        return passenger;

    }

    /**
     * @see org.iesc.flightws.domain.PassengerDao#passengerVOToEntity(org.iesc.flightws.vo.PassengerVO)
     */
    public org.iesc.flightws.domain.Passenger passengerVOToEntity(org.iesc.flightws.vo.PassengerVO passengerVO) {
        // @todo verify behavior of passengerVOToEntity
        org.iesc.flightws.domain.Passenger entity = this.loadPassengerFromPassengerVO(passengerVO);
        this.passengerVOToEntity(passengerVO, entity, true);
        return entity;
    }

    /**
     * @see org.iesc.flightws.domain.PassengerDao#passengerVOToEntity(org.iesc.flightws.vo.PassengerVO, org.iesc.flightws.domain.Passenger)
     */
    public void passengerVOToEntity(
            org.iesc.flightws.vo.PassengerVO source,
            org.iesc.flightws.domain.Passenger target,
            boolean copyIfNull) {
        // @todo verify behavior of passengerVOToEntity
        super.passengerVOToEntity(source, target, copyIfNull);
    }
}
