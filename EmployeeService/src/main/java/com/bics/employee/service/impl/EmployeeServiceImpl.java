/**
 * 
 */
package com.bics.employee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.bics.employee.model.Employee;
import com.bics.employee.service.EmployeeService;

/**
 * @author bosco
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

	AtomicInteger id = new AtomicInteger(0);
	
	static List<Employee> employees = new ArrayList<Employee>();
	
	/*
	 * code that generates dummy employees initially...
	 */
	public EmployeeServiceImpl() {
		employees.add(new Employee(id.incrementAndGet(), "Arun", "Salesman", 5000, "Jpt"));
		employees.add(new Employee(id.incrementAndGet(), "Kumar", "Salesman", 5000, "Jpt"));
		employees.add(new Employee(id.incrementAndGet(), "Samy", "Salesman", 5000, "Jpt"));
	}
	/*
	 * code to add the new employee in the list...
	 */
	@Override
	public void addEmployee(Employee employee) {
			employee.setId(id.incrementAndGet());
			employees.add(employee);
	}

	/*
	 * code to update the employee in the list...
	 */
	@Override
	public void updateEmployee(Employee employee) {
		for(Employee e:employees) {
			if(e.getId().equals(employee.getId())) {
				int index = employees.indexOf(e);
				employees.set(index, employee);
				break;
			}
		}
	}

	/*
	 * code to find an employee from the list...
	 */
	@Override
	public Employee findEmployeeById(Integer id) {
		for(Employee e:employees) {
			if(e.getId().equals(id)) {
				return e;
			}
		}
		return null;
	}

	/*
	 * code to delete an employee from the list...
	 */
	@Override
	public void deleteEmployeeById(Integer id) {
		for(Employee e:employees) {
			if(e.getId().equals(id)) {
				employees.remove(e);
				break;
			}
		}
	}

	/*
	 *code to list the employees in the list 
	 */
	@Override
	public List<Employee> listEmployees() {
		return employees;
	}

	/*
	 * code to delete all the employees in the list
	 * @see com.bics.employee.service.EmployeeService#deleteAllEmployees()
	 */
	@Override
	public void deleteAllEmployees() {
		employees.clear();
	}

}
