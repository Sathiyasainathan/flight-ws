// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package org.iesc.flightws.vo;

/**
 * 
 */
public class PassengerVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 2480800821738876323L;

    public PassengerVO()
    {
    }

    public PassengerVO(java.lang.Long type, java.lang.String name, java.lang.String surname, java.lang.String passportCode, java.lang.Long id)
    {
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.passportCode = passportCode;
        this.id = id;
    }

    /**
     * Copies constructor from other PassengerVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public PassengerVO(PassengerVO otherBean)
    {
        this(otherBean.getType(), otherBean.getName(), otherBean.getSurname(), otherBean.getPassportCode(), otherBean.getId());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(PassengerVO otherBean)
    {
        if (otherBean != null)
        {
            this.setType(otherBean.getType());
            this.setName(otherBean.getName());
            this.setSurname(otherBean.getSurname());
            this.setPassportCode(otherBean.getPassportCode());
            this.setId(otherBean.getId());
        }
    }

    private java.lang.Long type;

    /**
     * 
     */
    public java.lang.Long getType()
    {
        return this.type;
    }

    public void setType(java.lang.Long type)
    {
        this.type = type;
    }

    private java.lang.String name;

    /**
     * 
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String surname;

    /**
     * 
     */
    public java.lang.String getSurname()
    {
        return this.surname;
    }

    public void setSurname(java.lang.String surname)
    {
        this.surname = surname;
    }

    private java.lang.String passportCode;

    /**
     * 
     */
    public java.lang.String getPassportCode()
    {
        return this.passportCode;
    }

    public void setPassportCode(java.lang.String passportCode)
    {
        this.passportCode = passportCode;
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

    // org.iesc.flightws.vo.PassengerVO value-object java merge-point
}