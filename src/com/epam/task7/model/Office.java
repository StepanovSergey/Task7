/**
 * 
 */
package com.epam.task7.model;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Office extends Basic {
    private Company company;
    private Employee employee;
    private Address address;

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
     * @return the employee
     */
    public Employee getEmployee() {
	return employee;
    }

    /**
     * @param employee
     *            the employee to set
     */
    public void setEmployee(Employee employee) {
	this.employee = employee;
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
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((company == null) ? 0 : company.hashCode());
	result = prime * result
		+ ((employee == null) ? 0 : employee.hashCode());
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
	Office other = (Office) obj;
	if (address == null) {
	    if (other.address != null)
		return false;
	} else if (!address.equals(other.address))
	    return false;
	if (company == null) {
	    if (other.company != null)
		return false;
	} else if (!company.equals(other.company))
	    return false;
	if (employee == null) {
	    if (other.employee != null)
		return false;
	} else if (!employee.equals(other.employee))
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
	builder.append("Office [company=");
	builder.append(company);
	builder.append(", employee=");
	builder.append(employee);
	builder.append(", address=");
	builder.append(address);
	builder.append("]");
	return builder.toString();
    }

}
