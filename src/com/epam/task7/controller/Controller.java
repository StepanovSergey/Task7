package com.epam.task7.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.task7.dao.EmployeeHibernateDao;
import com.epam.task7.model.Employee;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Controller extends HttpServlet {
    private static final long serialVersionUID = -5470968915401047005L;

    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	process(request, response);
    }

    protected void doPost(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	process(request, response);
    }

    private void process(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	EmployeeHibernateDao dao = new EmployeeHibernateDao();
	Object obj = new Employee();
	obj = dao.getEmployee(1);
	request.getSession().setAttribute("object", obj);
	System.out.println("Object: " + obj);
	//dao.getEmployees();
	response.sendRedirect("jsp/showEmployees.jsp");
    }
}
