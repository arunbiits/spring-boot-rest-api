/**
 * 
 */
package com.bics.employee.service;

import java.util.List;

import com.bics.employee.model.Employee;

/**
 * @author bosco
 *
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Employee findEmployeeById(Integer id);
	
	public void deleteEmployeeById(Integer id);
	
	public List<Employee> listEmployees();
	
	public void deleteAllEmployees();
	
}
