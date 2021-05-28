package com.myapp.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.myapp.DAO.EmployeeDAOImplementation;
import com.myapp.myapp.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	private EmployeeDAOImplementation employeeDao;
	
	@Autowired
	EmployeeServiceImp(EmployeeDAOImplementation empDao)
	{
		employeeDao=empDao;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	@Transactional
	public void Save(Employee emp) {
		employeeDao.Save(emp);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		employeeDao.delete(id);
	}

}
