/**
 * 
 */
package com.bics.employee.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bics.employee.model.Employee;
import com.bics.employee.model.ResponseEntity;
import com.bics.employee.model.User;
import com.bics.employee.service.UserService;

/**
 * @author bosco
 *
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {

	@Autowired
	UserService userService;
	
	//Handles the GET requests with the parameter 'employees'...
		@GetMapping(value = { "users" })
		public List<User> getAllEmployees() {
			List<User> employees = userService.listUsers();
			return employees;
		}

		//handles the GET request with the parameter 'employees' and the path variable 'id'...
		@GetMapping(value = "users/{id}")
		public User findEmployeeById(@PathVariable Integer id) {
			User employee = userService.findUserById(id);
			return employee;
		}

		//handles the POST request with the parameter 'employees' to add a new data...
		@PostMapping(value = "users")
		public ResponseEntity addEmployee(@RequestBody User employee) {
			userService.addUser(employee);
			return new ResponseEntity("User added successfully", String.valueOf(HttpStatus.OK), new Date());
		}
		
		//handles the PUT request with the parameter 'employees' to update the existing data...
		@PutMapping(value = "users")
		public String updateEmployee(@RequestBody User employee) {
			userService.updateUser(employee);
			return "Data updated successfully";
		}
		
		//handles the DELETE request with the parameter 'employees' and the path variable 'id'...
		@GetMapping(value = "users/delete/{id}")
		public String deleteEmployeeById(@PathVariable Integer id) {
			userService.deleteUserById(id);
			return "Deleted successfully";
		}

		//handles the DELETE request with the parameter 'employees'
		@GetMapping(value = "users/deleteAll")
		public String deleteAllEmployees() {
			userService.deleteAllUsers();
			return "All details deleted successfully";
		}
}
