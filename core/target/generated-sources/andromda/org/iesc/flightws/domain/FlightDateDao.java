// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package org.iesc.flightws.domain;

/**
 * @see org.iesc.flightws.domain.FlightDate
 */
public interface FlightDateDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes no transformation will occur.
     */
    public final static int TRANSFORM_NONE = 0;


    /**
     * Transforms the given results to a collection of {@link com.lighthousepmg.plz.domain.messaging.persistence.CommunicationCategory}
     * instances (this is useful when the returned results contains a row of data and you want just entities only).
     *
     * @param the query results.
     */
    public void toEntities(final java.util.Collection results);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link org.iesc.flightws.vo.FlightDateVO}.
     */
    public final static int TRANSFORM_FLIGHTDATEVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toFlightDateVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     */
    public void toFlightDateVO(
        org.iesc.flightws.domain.FlightDate source,
        org.iesc.flightws.vo.FlightDateVO target);


    /**
     * Converts this DAO's entity to an object of type {@link org.iesc.flightws.vo.FlightDateVO}.
     */
    public org.iesc.flightws.vo.FlightDateVO toFlightDateVO(org.iesc.flightws.domain.FlightDate entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link org.iesc.flightws.vo.FlightDateVO}.
     */
    public void toFlightDateVOCollection(java.util.Collection entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link org.iesc.flightws.vo.FlightDateVO}.
     */
    public org.iesc.flightws.vo.FlightDateVO[] toFlightDateVOArray(java.util.Collection entities);

    /**
     * Copies the fields of {@link org.iesc.flightws.vo.FlightDateVO} to the specified entity.
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void flightDateVOToEntity(
        org.iesc.flightws.vo.FlightDateVO source,
        org.iesc.flightws.domain.FlightDate target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link org.iesc.flightws.vo.FlightDateVO} to this DAO's entity.
     */
    public org.iesc.flightws.domain.FlightDate flightDateVOToEntity(org.iesc.flightws.vo.FlightDateVO flightDateVO);

    /**
     * Converts a Collection of instances of type {@link org.iesc.flightws.vo.FlightDateVO} to this
     * DAO's entity.
     */
    public void flightDateVOToEntityCollection(java.util.Collection instances);

    /**
     * Loads an instance of org.iesc.flightws.domain.FlightDate from the persistent store.
     */
    public org.iesc.flightws.domain.FlightDate load(java.lang.Long id);

    /**
     * <p>
     * Does the same thing as {@link #load(java.lang.Long)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, java.lang.Long id);

    /**
     * Loads all entities of type {@link org.iesc.flightws.domain.FlightDate}.
     *
     * @return the loaded entities.
     */
    public java.util.Collection loadAll();

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform);

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int pageNumber, final int pageSize);

    /**
     * <p>
     * Does the same thing as {@link #loadAll(int)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform, final int pageNumber, final int pageSize);

    /**
     * Creates an instance of org.iesc.flightws.domain.FlightDate and adds it to the persistent store.
     */
    public org.iesc.flightws.domain.FlightDate create(org.iesc.flightws.domain.FlightDate flightDate);

    /**
     * <p>
     * Does the same thing as {@link #create(org.iesc.flightws.domain.FlightDate)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(int transform, org.iesc.flightws.domain.FlightDate flightDate);

    /**
     * Creates a new instance of org.iesc.flightws.domain.FlightDate and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of org.iesc.flightws.domain.FlightDate
     * instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     * Does the same thing as {@link #create(org.iesc.flightws.domain.FlightDate)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public java.util.Collection create(int transform, java.util.Collection entities);

    /**
     * <p>
     * Creates a new <code>org.iesc.flightws.domain.FlightDate</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     */
    public org.iesc.flightws.domain.FlightDate create(
        java.sql.Timestamp departureDate,
        java.sql.Timestamp arrivalDate);

    /**
     * <p>
     * Does the same thing as {@link #create(java.sql.Timestamp, java.sql.Timestamp)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.sql.Timestamp departureDate,
        java.sql.Timestamp arrivalDate);

    /**
     * <p>
     * Creates a new <code>org.iesc.flightws.domain.FlightDate</code>
     * instance from only <strong>required</strong> properties (attributes
     * and association ends) and adds it to the persistent store.
     * </p>
     */
    public org.iesc.flightws.domain.FlightDate create(
        java.sql.Timestamp arrivalDate,
        java.sql.Timestamp departureDate,
        org.iesc.flightws.domain.Flight flight,
        org.iesc.flightws.domain.Plane plane,
        java.util.Collection prices);

    /**
     * <p>
     * Does the same thing as {@link #create(java.sql.Timestamp, java.sql.Timestamp)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.sql.Timestamp arrivalDate,
        java.sql.Timestamp departureDate,
        org.iesc.flightws.domain.Flight flight,
        org.iesc.flightws.domain.Plane plane,
        java.util.Collection prices);

    /**
     * Updates the <code>flightDate</code> instance in the persistent store.
     */
    public void update(org.iesc.flightws.domain.FlightDate flightDate);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of org.iesc.flightws.domain.FlightDate from the persistent store.
     */
    public void remove(org.iesc.flightws.domain.FlightDate flightDate);

    /**
     * Removes the instance of org.iesc.flightws.domain.FlightDate having the given
     * <code>identifier</code> from the persistent store.
     */
    public void remove(java.lang.Long id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     */
    public void remove(java.util.Collection entities);

    /**
     * 
     */
    public java.util.Collection getFlightDatesByCriteria(org.iesc.flightws.vo.FlightSearchCriteriaVO searchCriteria);


    /**
     * Does the same thing as {@link #search(int, org.iesc.flightws.Search) but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param transform the transformation flag.
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link org.iesc.flightws.PaginationResult} instance.
     */
    public org.iesc.flightws.PaginationResult search(final int transform, final int pageNumber, final int pageSize, final org.iesc.flightws.Search search);

    /**
     * Does the same thing as {@link #search(org.iesc.flightws.Search) but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link org.iesc.flightws.PaginationResult} instance.
     */
    public org.iesc.flightws.PaginationResult search(final int pageNumber, final int pageSize, final org.iesc.flightws.Search search);

    /**
     * Does the same thing as {@link #search(org.iesc.flightws.Search)} but with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     *
     * @param transform the transformation flag.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public java.util.Set search(final int transform, final org.iesc.flightws.Search search);

    /**
     * Performs a search using the parameters specified in the given <code>search</code> object.
     *
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public java.util.Set search(final org.iesc.flightws.Search search);

    // spring-dao merge-point
}