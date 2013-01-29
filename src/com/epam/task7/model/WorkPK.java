/**
 * 
 */
package com.epam.task7.model;

import java.io.Serializable;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class WorkPK implements Serializable {
    private static final long serialVersionUID = -2070461894179585302L;
    private int office;
    private int employee;

    public WorkPK() {
    }

    /**
     * @return the id_office
     */
    public int getOffice() {
	return office;
    }

    /**
     * @param id_office
     *            the id_office to set
     */
    public void setOffice(int id_office) {
	this.office = id_office;
    }

    /**
     * @return the id_employee
     */
    public int getEmployee() {
	return employee;
    }

    /**
     * @param id_employee
     *            the id_employee to set
     */
    public void setEmployee(int id_employee) {
	this.employee = id_employee;
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
	result = prime * result + employee;
	result = prime * result + office;
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
	WorkPK other = (WorkPK) obj;
	if (employee != other.employee)
	    return false;
	if (office != other.office)
	    return false;
	return true;
    }

}
