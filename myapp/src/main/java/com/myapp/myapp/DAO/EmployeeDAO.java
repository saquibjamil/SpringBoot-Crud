package com.myapp.myapp.DAO;

import java.util.List;
import com.myapp.myapp.entity.Employee;

public interface EmployeeDAO {

public List<Employee> findAll();

public Employee findById(int id);

public void Save(Employee e);

public void delete(int id);
}
