package com.epam.task7.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.task7.dao.EmployeeHibernateDao;
import com.epam.task7.model.Employee;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
final class RequestHelper {
    private static final RequestHelper requestHelper = new RequestHelper();
    private static final EmployeeHibernateDao DAO = new EmployeeHibernateDao();
    public static final String EMPLYEE_LIST_PARAMETER = "employeeList";
    
    private RequestHelper() {
    }

    /**
     * @return the requestHelper
     */
    public static RequestHelper getRequestHelper() {
	return requestHelper;
    }

    public void getEmployees(HttpServletRequest request,
	    HttpServletResponse response) {
	List<Employee> employeeList = DAO.getEmployees();
	request.getSession().setAttribute(EMPLYEE_LIST_PARAMETER, employeeList);
    }
}
