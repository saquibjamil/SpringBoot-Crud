package com.myapp.myapp.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.myapp.myapp.entity.Employee;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

	private EntityManager entitymanager;
	
	@Autowired
	public EmployeeDAOImplementation(EntityManager theEntityManager)
	{
		entitymanager=theEntityManager;
	}
	
	@Override
	public List<Employee> findAll()
	{
		Session currentSession=entitymanager.unwrap(Session.class);
		
		Query<Employee> query=currentSession.createQuery("from Employee", Employee.class);
		
		List<Employee> result=query.getResultList();
		return result; 
	}

	@Override
	public Employee findById(int id) {
		Session currentSession=entitymanager.unwrap(Session.class);
		Employee emp=currentSession.get(Employee.class, id);
		return emp;
	}

	@Override
	public void Save(Employee emp) {
		Session currentSession=entitymanager.unwrap(Session.class);
		currentSession.saveOrUpdate(emp);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession=entitymanager.unwrap(Session.class);
		Query query =currentSession.createQuery("delete from employee where id=:empid");
		query.setParameter("empid", id);
		query.executeUpdate();
		
	}
	
	
}
