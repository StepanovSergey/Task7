/**
 * 
 */
package com.epam.task7.model;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class City {
    private int id;
    private String name;
    private Country country;

    public City() {
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the country
     */
    public Country getCountry() {
	return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(Country country) {
	this.country = country;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("City ");
	builder.append(name);
	builder.append(", ");
	builder.append(country);
	builder.append(" ");
	return builder.toString();
    }

}
