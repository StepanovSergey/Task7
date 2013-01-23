package com.epam.task7.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.epam.task7.model.Address;
import com.epam.task7.model.City;
import com.epam.task7.model.Company;
import com.epam.task7.model.Country;
import com.epam.task7.model.Employee;
import com.epam.task7.model.Office;
import com.epam.task7.model.OfficePK;
import com.epam.task7.model.Position;
import com.epam.task7.utils.HibernateUtil;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public final class EmployeeHibernateDao {
    private static final SessionFactory SESSION_FACTORY = HibernateUtil
	    .getSessionFactory();
    private String queryS = "select employee.firstname, employee.lastname, " +
    		"country.country_name as country, city.city_name as city, " +
    		"address.street, address.building, address.apartment, " +
    		"company.company_name,  country.country_name as office_country, " +
    		"city.city_name as city_office, company_address.street as street_office, " +
    		"company_address.building as building_office, " +
    		"company_address.apartment as apartment_office, " +
    		"(select count(office.id_employee) from office o " +
    		"where o.id_company=office.id_company group by o.id_company) as count, " +
    		"position.position_name from office " +
    		"join address on address.id_address=office.id_address " +
    		"join city on city.id_city=address.id_city " +
    		"join country on country.id_country=city.id_country " +
    		"join employee on employee.id_employee=office.id_employee " +
    		"join company on company.id_company=office.id_company " +
    		"join address company_address on " +
    		"office.id_address=company_address.id_address " +
    		"join position on position.id_position=office.id_position";

    public Country getCountry(int id) {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	Country country = new Country();
	country = (Country) session.get(country.getClass(), 1);
	transaction.commit();
	return country;
    }

    public City getCity(int id) {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	City city = new City();
	city = (City) session.get(city.getClass(), 1);
	transaction.commit();
	return city;
    }

    public Address getAddress(int id) {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	Address address = new Address();
	address = (Address) session.get(address.getClass(), 1);
	transaction.commit();
	return address;
    }

    public Employee getEmployee(int id) {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	Employee employee = new Employee();
	employee = (Employee) session.get(employee.getClass(), 1);
	transaction.commit();
	return employee;
    }

    public Position getPosition(int id) {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	Position position = new Position();
	position = (Position) session.get(position.getClass(), 1);
	transaction.commit();
	return position;
    }

    public Company getCompany(int id) {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	Company company = new Company();
	company = (Company) session.get(company.getClass(), 1);
	transaction.commit();
	return company;
    }

    public Office getOffice(OfficePK officePK) {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	officePK.setAddress(1);
	officePK.setCompany(1);
	officePK.setEmployee(1);
	Office office = new Office();
	office = (Office) session.get(office.getClass(), officePK);
	transaction.commit();
	return office;
    }

    public void getEmployees() {
	Session session = SESSION_FACTORY.getCurrentSession();
	Transaction transaction = session.beginTransaction();
	Query query = session.createSQLQuery(queryS);
	List<?> list = query.list();
	for (Object o : list) {
	    System.out.println(o);
	}
    }
}
