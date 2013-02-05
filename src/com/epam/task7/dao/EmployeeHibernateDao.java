package com.epam.task7.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.epam.task7.model.Employee;
import com.epam.task7.utils.HibernateUtil;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public final class EmployeeHibernateDao {
    private static final SessionFactory SESSION_FACTORY = HibernateUtil
	    .getSessionFactory();

    public List<Employee> getEmployees() {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	Query query = session.createQuery("select distinct e from Employee e");
	query.setMaxResults(100);
	long startTime = System.currentTimeMillis();
	List<Employee> list = query.list();
	long endTime = System.currentTimeMillis();
	double time = (endTime - startTime) / 1000D;
	System.out.println("Time for query: " + time);
	transaction.commit();
	return list;
    }
}
