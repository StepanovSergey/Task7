package com.epam.task7.model;

import java.util.Set;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Address address;
    private Set<Office> offices;

    public Employee() {
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
     * @return the firstName
     */
    public String getFirstName() {
	return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
	return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(Address address) {
	this.address = address;
    }

    /**
     * @return the offices
     */
    public Set<Office> getOffices() {
	return offices;
    }

    /**
     * @param offices
     *            the offices to set
     */
    public void setOffices(Set<Office> offices) {
	this.offices = offices;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(firstName);
	builder.append(" ");
	builder.append(lastName);
	builder.append(", ");
	builder.append(address);
	builder.append(", ");
	builder.append(offices);
	return builder.toString();
    }

}
