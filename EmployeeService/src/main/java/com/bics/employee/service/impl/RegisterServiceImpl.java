/**
 * 
 */
package com.bics.employee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.bics.employee.model.RegisterBean;

/**
 * @author bosco
 *
 */
@Service
public class RegisterServiceImpl {

	private static List<RegisterBean> registerers = new ArrayList<>();
	
	private static AtomicInteger id = new AtomicInteger(0);
	
	public RegisterServiceImpl() {
		
	}
	
	public void addRegister(RegisterBean register) {
		registerers.add(register);
	}
	
	public List<RegisterBean> listRegisterers(){
		return registerers;
	}
	
}
