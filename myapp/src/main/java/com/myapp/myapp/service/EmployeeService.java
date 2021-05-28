package com.myapp.myapp.service;

import java.util.List;

import com.myapp.myapp.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int id);

	public void Save(Employee emp);

	public void delete(int id);
}
