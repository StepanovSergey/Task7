package com.epam.task7.model;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Address {
    private int id;
    private String street;
    private int building;
    private int apartment;
    private City city;

    public Address() {
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
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(city.getCountry().getName());
	builder.append(", ");
	builder.append(city.getName());
	builder.append(", ");
	builder.append(street);
	builder.append(" street, ");
	builder.append(building);
	builder.append(" building, ");
	builder.append(apartment);
	builder.append(" ap. ");
	return builder.toString();
    }

}
