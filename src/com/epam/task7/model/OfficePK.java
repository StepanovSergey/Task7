package com.epam.task7.model;

import java.io.Serializable;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class OfficePK implements Serializable {
    private static final long serialVersionUID = -2083057221672879221L;
    private int company;
    private int employee;
    private int address;

    public OfficePK() {
    }

    /**
     * @return the company
     */
    public int getCompany() {
	return company;
    }

    /**
     * @param company
     *            the company to set
     */
    public void setCompany(int company) {
	this.company = company;
    }

    /**
     * @return the employee
     */
    public int getEmployee() {
	return employee;
    }

    /**
     * @param employee
     *            the employee to set
     */
    public void setEmployee(int employee) {
	this.employee = employee;
    }

    /**
     * @return the address
     */
    public int getAddress() {
	return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(int address) {
	this.address = address;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + address;
	result = prime * result + company;
	result = prime * result + employee;
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
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	OfficePK other = (OfficePK) obj;
	if (address != other.address)
	    return false;
	if (company != other.company)
	    return false;
	if (employee != other.employee)
	    return false;
	return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("OfficePK [company=");
	builder.append(company);
	builder.append(", employee=");
	builder.append(employee);
	builder.append(", address=");
	builder.append(address);
	builder.append("]");
	return builder.toString();
    }
    
}
