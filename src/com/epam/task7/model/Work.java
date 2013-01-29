package com.epam.task7.model;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Work {
    private WorkPK workPK;
    private Employee employee;
    private Office office;
    private Position position;
    private int countOfEmployees;

    public Work() {
    }

    /**
     * @return the workPK
     */
    public WorkPK getWorkPK() {
	return workPK;
    }

    /**
     * @param workPK
     *            the workPK to set
     */
    public void setWorkPK(WorkPK workPK) {
	this.workPK = workPK;
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
     * @return the office
     */
    public Office getOffice() {
	return office;
    }

    /**
     * @param office
     *            the office to set
     */
    public void setOffice(Office office) {
	this.office = office;
    }

    /**
     * @return the countOfEmployees
     */
    public int getCountOfEmployees() {
	return countOfEmployees;
    }

    /**
     * @param countOfEmployees
     *            the countOfEmployees to set
     */
    public void setCountOfEmployees(int countOfEmployees) {
	this.countOfEmployees = countOfEmployees;
    }

    /**
     * @return the position
     */
    public Position getPosition() {
	return position;
    }

    /**
     * @param position
     *            the position to set
     */
    public void setPosition(Position position) {
	this.position = position;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Work [workPK=");
	builder.append(workPK);
	builder.append(", employee=");
	builder.append(employee);
	builder.append(", office=");
	builder.append(office);
	builder.append(", position=");
	builder.append(position);
	builder.append(", countOfEmployees=");
	builder.append(countOfEmployees);
	builder.append("]");
	return builder.toString();
    }

}
