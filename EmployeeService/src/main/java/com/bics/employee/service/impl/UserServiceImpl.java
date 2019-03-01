/**
 * 
 */
package com.bics.employee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.bics.employee.model.Employee;
import com.bics.employee.model.User;
import com.bics.employee.service.UserService;

/**
 * @author bosco
 *
 */
@Service
public class UserServiceImpl implements UserService {

AtomicInteger id = new AtomicInteger(0);
	
	static List<User> employees = new ArrayList<User>();
	
	/*
	 * code that generates dummy employees initially...
	 */
	public UserServiceImpl() {
		employees.add(new User(id.incrementAndGet(), "Arun", "arun@gmail.com", "9659699735","Angular","morning",true));
		employees.add(new User(id.incrementAndGet(), "Vijay", "vijay@gmail.com", "9659699735","Angular","morning",true));
		employees.add(new User(id.incrementAndGet(), "Sanjay", "sanjay@gmail.com", "9659699735","Angular","morning",true));
	}
	/*
	 * code to add the new employee in the list...
	 */
	@Override
	public void addUser(User employee) {
			employee.setId(id.incrementAndGet());
			employees.add(employee);
	}

	/*
	 * code to update the employee in the list...
	 */
	@Override
	public void updateUser(User employee) {
		for(User e:employees) {
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
	public User findUserById(Integer id) {
		for(User e:employees) {
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
	public void deleteUserById(Integer id) {
		for(User e:employees) {
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
	public List<User> listUsers() {
		return employees;
	}

	/*
	 * code to delete all the employees in the list
	 * @see com.bics.employee.service.EmployeeService#deleteAllEmployees()
	 */
	@Override
	public void deleteAllUsers() {
		employees.clear();
	}
}
