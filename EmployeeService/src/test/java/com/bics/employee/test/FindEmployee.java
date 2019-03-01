/**
 * 
 */
package com.bics.employee.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.bics.employee.controller.EmployeeController;

/**
 * @author bosco
 *
 */	
@RunWith(SpringRunner.class)
public class FindEmployee {
 
	private MockMvc mockMvc;

	@InjectMocks
	EmployeeController employeeController;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(EmployeeController.class).build();
	}
	
	@Test
	public void helloEmployeeTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
				.andExpect(MockMvcResultMatchers.status().isOk()).
				andExpect(MockMvcResultMatchers.content().string("hello employees"));
				
	}

}
