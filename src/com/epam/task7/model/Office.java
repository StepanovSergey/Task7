package com.epam.task7.model;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Office {
    private int id;
    private Company company;
    private Address address;

    public Office() {
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
     * @return the company
     */
    public Company getCompany() {
	return company;
    }

    /**
     * @param company
     *            the company to set
     */
    public void setCompany(Company company) {
	this.company = company;
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
	builder.append("Office [id=");
	builder.append(id);
	builder.append(", company=");
	builder.append(company);
	builder.append(", address=");
	builder.append(address);
	builder.append("]");
	return builder.toString();
    }

}
