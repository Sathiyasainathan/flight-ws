// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: DefaultServiceException.vsl in andromda-spring-cartridge.
//
package org.iesc.flightws.service;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * The default exception thrown for unexpected errors occurring
 * within {@link org.iesc.flightws.service.FlightService}.
 */
public class FlightServiceException
    extends java.lang.RuntimeException
{
    /** 
     * The serial version UID of this class. Needed for serialization. 
     */
    private static final long serialVersionUID = 3315894608979594909L;

    /**
     * The default constructor for <code>FlightServiceException</code>.
     */
    public FlightServiceException()
    {}

    /**
     * Constructs a new instance of <code>FlightServiceException</code>.
     *
     * @param throwable the parent Throwable
     */
    public FlightServiceException(Throwable throwable)
    {
        super(findRootCause(throwable));
    }

    /**
     * Constructs a new instance of <code>FlightServiceException</code>.
     *
     * @param message the throwable message.
     */
    public FlightServiceException(String message)
    {
        super(message);
    }

    /**
     * Constructs a new instance of <code>FlightServiceException</code>.
     *
     * @param message the throwable message.
     * @param throwable the parent of this Throwable.
     */
    public FlightServiceException(String message, Throwable throwable)
    {
        super(message, findRootCause(throwable));
    }

    /**
     * Finds the root cause of the parent exception
     * by traveling up the exception tree
     */
    private static Throwable findRootCause(Throwable th)
    {
        if (th != null)
        {
            // Reflectively get any exception causes.
            try
            {
                Throwable targetException = null;

                // java.lang.reflect.InvocationTargetException
                String exceptionProperty = "targetException";
                if (PropertyUtils.isReadable(th, exceptionProperty))
                {
                    targetException = (Throwable)PropertyUtils.getProperty(th, exceptionProperty);
                }
                else
                {
                    exceptionProperty = "causedByException";
                    //javax.ejb.EJBException
                    if (PropertyUtils.isReadable(th, exceptionProperty))
                    {
                        targetException = (Throwable)PropertyUtils.getProperty(th, exceptionProperty);
                    }
                }
                if (targetException != null)
                {
                    th = targetException;
                }
            }
            catch (Exception ex)
            {
                // just print the exception and continue
                ex.printStackTrace();
            }

            if (th.getCause() != null)
            {
                th = th.getCause();
                th = findRootCause(th);
            }
        }
        return th;
    }
}