package com.myapp.myapp.Rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.myapp.DAO.CustomerRepo;
import com.myapp.myapp.entity.Employee;
import com.myapp.myapp.service.EmployeeServiceImp;

import dto.OrderResponse;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	private EmployeeServiceImp employeeServiceImp;
	@Autowired
	private CustomerRepo customerepo;
	
	@Autowired
	public EmployeeController(EmployeeServiceImp ed)
	{
		employeeServiceImp=ed;
	}
	
//	@GetMapping("/employees")
//	public List<Employee> getEmployees()
//	{
//		List<Employee> empList=new ArrayList<Employee>();
//		empList=employeeServiceImp.findAll();
//		return empList;
//	}
//	
//	@GetMapping("/employees/{employeeId}")
//	public Employee getEmployee(@PathVariable int employeeId)
//	{
//		Employee theEmployee=employeeServiceImp.findById(employeeId);
//		if(theEmployee==null)
//			throw new RuntimeException("EmployeeNotFound");
//		return theEmployee;
//	}
//	
//	@PostMapping("/employees")
//	public Employee addEmployee(@RequestBody Employee theEmployee)
//	{
//		theEmployee.setId(0);
//		employeeServiceImp.Save(theEmployee);
//		return theEmployee;
//	}
//	
//	
//	@PutMapping("/employees")
//	public Employee updateEmployee(@RequestBody Employee theEmployee)
//	{
//		employeeServiceImp.Save(theEmployee);
//		return theEmployee;
//	}
//	
//	@DeleteMapping("/employees/{employee}")
//	public String deleteEmployee(@PathVariable int employeeId)
//	{
//		Employee theEmployee=employeeServiceImp.findById(employeeId);
//		if(theEmployee==null)
//			throw new RuntimeException("no Employee found with id : "+employeeId);
//		employeeServiceImp.delete(employeeId);
//		return new String("Employee deleted with id : "+employeeId);
//	}
//	
	@GetMapping("/customer")
	public List<OrderResponse> getCustomer()
	{
		List<OrderResponse> cusList=new ArrayList<OrderResponse>();
		cusList=customerepo.getInformation();
		return cusList;
	}

}
