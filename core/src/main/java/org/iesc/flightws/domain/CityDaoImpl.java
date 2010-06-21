// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.iesc.flightws.domain;
/**
 * @see org.iesc.flightws.domain.City
 */
public class CityDaoImpl
    extends org.iesc.flightws.domain.CityDaoBase
{
    /**
     * @see org.iesc.flightws.domain.CityDao#toCityVO(org.iesc.flightws.domain.City, org.iesc.flightws.vo.CityVO)
     */
    public void toCityVO(
        org.iesc.flightws.domain.City source,
        org.iesc.flightws.vo.CityVO target)
    {
        // @todo verify behavior of toCityVO
        super.toCityVO(source, target);
    }


    /**
     * @see org.iesc.flightws.domain.CityDao#toCityVO(org.iesc.flightws.domain.City)
     */
    public org.iesc.flightws.vo.CityVO toCityVO(final org.iesc.flightws.domain.City entity)
    {
        // @todo verify behavior of toCityVO
        return super.toCityVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private org.iesc.flightws.domain.City loadCityFromCityVO(org.iesc.flightws.vo.CityVO cityVO)
    {
        // @todo implement loadCityFromCityVO
        throw new java.lang.UnsupportedOperationException("org.iesc.flightws.domain.loadCityFromCityVO(org.iesc.flightws.vo.CityVO) not yet implemented.");

        /* A typical implementation looks like this:
        org.iesc.flightws.domain.City city = this.load(cityVO.getId());
        if (city == null)
        {
            city = org.iesc.flightws.domain.City.Factory.newInstance();
        }
        return city;
        */
    }

    
    /**
     * @see org.iesc.flightws.domain.CityDao#cityVOToEntity(org.iesc.flightws.vo.CityVO)
     */
    public org.iesc.flightws.domain.City cityVOToEntity(org.iesc.flightws.vo.CityVO cityVO)
    {
        // @todo verify behavior of cityVOToEntity
        org.iesc.flightws.domain.City entity = this.loadCityFromCityVO(cityVO);
        this.cityVOToEntity(cityVO, entity, true);
        return entity;
    }


    /**
     * @see org.iesc.flightws.domain.CityDao#cityVOToEntity(org.iesc.flightws.vo.CityVO, org.iesc.flightws.domain.City)
     */
    public void cityVOToEntity(
        org.iesc.flightws.vo.CityVO source,
        org.iesc.flightws.domain.City target,
        boolean copyIfNull)
    {
        // @todo verify behavior of cityVOToEntity
        super.cityVOToEntity(source, target, copyIfNull);
    }

}