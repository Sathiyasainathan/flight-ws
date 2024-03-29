// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SearchParameter.java.vsl in andromda-spring-cartridge.
//
package org.iesc.flightws;

/**
 * Represents a generic search parameter that can be used with property
 * searches.
 *
 * @see PropertySearch
 */
public class SearchParameter
    implements java.io.Serializable
{
    public static final int LIKE_COMPARATOR = 0;
    public static final int INSENSITIVE_LIKE_COMPARATOR = 1;
    public static final int EQUAL_COMPARATOR = 2;
    public static final int GREATER_THAN_OR_EQUAL_COMPARATOR = 3;
    public static final int GREATER_THAN_COMPARATOR = 4;
    public static final int LESS_THAN_OR_EQUAL_COMPARATOR = 5;
    public static final int LESS_THAN_COMPARATOR = 6;
    public static final int IN_COMPARATOR = 7;
    public static final int NOT_EQUAL_COMPARATOR = 8;
    public static final int NOT_NULL_COMPARATOR = 9;
    public static final int NULL_COMPARATOR = 10;
    public static final int NOT_IN_COMPARATOR = 11;

    /** Order unset */
    public static final int ORDER_UNSET = -1;

    /** Ascending order */
    public static final int ORDER_ASC = 0;

    /** Descending order */
    public static final int ORDER_DESC = 1;

    public static final int MATCH_ANYWHERE = 0;
    public static final int MATCH_START = 1;
    public static final int MATCH_END = 2;
    public static final int MATCH_EXACT = 3;

    /**
     * Constructor taking name and value properties.
     */
    public SearchParameter(
        java.lang.String name,
        java.lang.Object value)
    {
       this(name, value, EQUAL_COMPARATOR);
    }

    /**
     * Constructor taking name and comparator properties.
     */
    public SearchParameter(
        java.lang.String name,
        int comparator)
    {
        this(name, null, comparator);
    }

    /**
     * Constructor taking name, value and comparator properties.
     */
    public SearchParameter(
        java.lang.String name,
        java.lang.Object value,
        int comparator)
    {
        this(name, value, comparator, MATCH_EXACT);
    }

    /**
     * Constructor taking name, value, comparator and order properties.
     */
    public SearchParameter(
        java.lang.String name,
        java.lang.Object value,
        int comparator,
        int match)
    {
        this(name, value, comparator, match, ORDER_UNSET);
    }

    /**
     * Constructor taking name, value, comparator, order and match properties.
     */
    public SearchParameter(
        java.lang.String name,
        java.lang.Object value,
        int comparator,
        int match,
        int order)
    {
        this(name, value, comparator, match, order, false);
    }

    /**
     * Constructor taking all properties.
     */
    public SearchParameter(
        java.lang.String name,
        java.lang.Object value,
        int comparator,
        int match,
        int order,
        boolean searchIfNull)
    {
        this.name = name;
        this.value = value;
        this.comparator = comparator;
        this.order = order;
        this.match = match;
        this.searchIfNull = searchIfNull;
    }

    /**
     * Copies constructor from other SearchParameter
     */
    public SearchParameter(SearchParameter otherBean)
    {
        if (otherBean != null)
        {
            this.name = otherBean.getName();
            this.value = otherBean.getValue();
            this.comparator = otherBean.getComparator();
            this.order = otherBean.getOrder();
            this.match = otherBean.getMatch();
            this.searchIfNull = otherBean.isSearchIfNull();
        }
    }


    private java.lang.String name;

    /**
     * <p>
     * The parameter name in dot notation (i.e. person.firstNAme).
     * </p>
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.Object value;

    /**
     * The value of the parameter.
     */
    public java.lang.Object getValue()
    {
        return this.value;
    }

    public void setValue(java.lang.Object value)
    {
        this.value = value;
    }

    private int comparator = EQUAL_COMPARATOR;

    /**
     *
     */
    public int getComparator()
    {
        return this.comparator;
    }

    public void setComparator(int comparator)
    {
        this.comparator = comparator;
    }

    private int order;

    /**
     * <p>
     * Order attribute to control if parameter is usedin order by
     * clause.
     * </p>
     */
    public int getOrder()
    {
        return this.order;
    }

    public void setOrder(int order)
    {
        this.order = order;
    }

    private boolean searchIfNull;

    /**
     * Whether this parameter will be included in the search even if it is <code>null</code>.
     *
     * @return true/false
     */
    public boolean isSearchIfNull()
    {
        return this.searchIfNull;
    }

    /**
     * Defines whether parameter will be included in the search even if it is <code>null</code>.
     *
     * @param searchIfNull <code>true</code> if the parameter should be included in the search
     *                     even if it is null, <code>false</code> otherwise.
     */
    public void setSearchIfNull(boolean searchIfNull)
    {
        this.searchIfNull = searchIfNull;
    }

    private int match;

    /**
     * Gets the match attribute which controls how parameter values are matched (anywhere, start, end or exact).
     *
     * @return the match mode
     */
    public int getMatch()
    {
        return this.match;
    }

    /**
     * Sets the match mode attribute which controls how parameter values are matched (anywhere, start, end or exact).
     *
     * @return the match mode
     */
    public void setMatch(int match)
    {
        this.match = match;
    }

    private static final long serialVersionUID = 1L;
}