/**
 * 
 */
package com.bics.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bics.employee.model.Employee;
import com.bics.employee.service.EmployeeService;

/**
 * @author bosco
 *
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EmployeeController {

	EmployeeService employeeService;

	// Constructor Injection
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping(value= "hello")
	public String helloEmployee() {
		return "hello employees";
	}

	//Handles the GET requests with the parameter 'employees'...
	@GetMapping(value = { "employees" })
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeService.listEmployees();
		return employees;
	}

	//handles the GET request with the parameter 'employees' and the path variable 'id'...
	@GetMapping(value = "employees/{id}")
	public Employee findEmployeeById(@PathVariable Integer id) {
		Employee employee = employeeService.findEmployeeById(id);
		return employee;
	}

	//handles the POST request with the parameter 'employees' to add a new data...
	@PostMapping(value = "employees")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Data added successfully";
	}
	
	//handles the PUT request with the parameter 'employees' to update the existing data...
	@PutMapping(value = "employees")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return "Data updated successfully";
	}
	
	//handles the DELETE request with the parameter 'employees' and the path variable 'id'...
	@GetMapping(value = "employees/delete/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) {
		employeeService.deleteEmployeeById(id);
		return "Deleted successfully";
	}

	//handles the DELETE request with the parameter 'employees'
	@GetMapping(value = "employees/deleteAll")
	public String deleteAllEmployees() {
		employeeService.deleteAllEmployees();
		return "All details deleted successfully";
	}
	

}
