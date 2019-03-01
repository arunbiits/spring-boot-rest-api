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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bics.employee.model.RegisterBean;
import com.bics.employee.model.ResponseEntity;
import com.bics.employee.service.impl.RegisterServiceImpl;

/**
 * @author bosco
 *
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RegisterController {

	@Autowired
	RegisterServiceImpl service;
	
	@PostMapping("/register")
	public ResponseEntity addRegister(@RequestBody RegisterBean registerBean) {
		service.addRegister(registerBean);
		return new ResponseEntity("Added successfully.", String.valueOf(HttpStatus.OK), new Date());
	}
	
	@GetMapping("/register")
	public List<RegisterBean> listRegister(){
		return service.listRegisterers();
	}
}
