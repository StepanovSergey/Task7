/**
 * 
 */
package com.epam.task7.model;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Address extends Basic {
    private String street;
    private int building;
    private int apartment;
    private City city;

    /**
     * @return the street
     */
    public String getStreet() {
	return street;
    }

    /**
     * @param street
     *            the street to set
     */
    public void setStreet(String street) {
	this.street = street;
    }

    /**
     * @return the building
     */
    public int getBuilding() {
	return building;
    }

    /**
     * @param building
     *            the building to set
     */
    public void setBuilding(int building) {
	this.building = building;
    }

    /**
     * @return the apartment
     */
    public int getApartment() {
	return apartment;
    }

    /**
     * @param apartment
     *            the apartment to set
     */
    public void setApartment(int apartment) {
	this.apartment = apartment;
    }

    /**
     * @return the city
     */
    public City getCity() {
	return city;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity(City city) {
	this.city = city;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + apartment;
	result = prime * result + building;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((street == null) ? 0 : street.hashCode());
	return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Address other = (Address) obj;
	if (apartment != other.apartment)
	    return false;
	if (building != other.building)
	    return false;
	if (city == null) {
	    if (other.city != null)
		return false;
	} else if (!city.equals(other.city))
	    return false;
	if (street == null) {
	    if (other.street != null)
		return false;
	} else if (!street.equals(other.street))
	    return false;
	return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Address [street=");
	builder.append(street);
	builder.append(", building=");
	builder.append(building);
	builder.append(", apartment=");
	builder.append(apartment);
	builder.append(", city=");
	builder.append(city);
	builder.append("]");
	return builder.toString();
    }

}
