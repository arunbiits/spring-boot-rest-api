/**
 * 
 */
package com.bics.employee.service;

import java.util.List;

import com.bics.employee.model.Employee;
import com.bics.employee.model.User;

/**
 * @author bosco
 *
 */
public interface UserService {
	
	public void addUser(User employee);
	
	public void updateUser(User employee);
	
	public User findUserById(Integer id);
	
	public void deleteUserById(Integer id);
	
	public List<User> listUsers();
	
	public void deleteAllUsers();
	
	
}
