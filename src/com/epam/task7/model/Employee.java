package com.epam.task7.model;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 4462945517583558083L;
    private int id;
    private String firstName;
    private String lastName;
    private Address address;
    private Set<Work> works;

    public Employee() {
    }

    /**
     * @return the works
     */
    public Set<Work> getWorks() {
	return works;
    }

    /**
     * @param works
     *            the works to set
     */
    public void setWorks(Set<Work> works) {
	this.works = works;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Employee [id=");
	builder.append(id);
	builder.append(", firstName=");
	builder.append(firstName);
	builder.append(", lastName=");
	builder.append(lastName);
	builder.append(", address=");
	builder.append(address);
	builder.append(", works=");
	builder.append(works);
	builder.append("]");
	return builder.toString();
    }
}
