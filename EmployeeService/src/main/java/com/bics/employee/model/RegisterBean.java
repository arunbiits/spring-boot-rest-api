/**
 * 
 */
package com.bics.employee.model;

import java.util.List;

/**
 * @author bosco
 *
 */
public class RegisterBean {

	private String userName;
	private String email;
	private List<String> alternateEmails;
	private boolean subscribe;
	private String password;
	private Address address;
	
	public RegisterBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userName
	 * @param email
	 * @param alternateEmails
	 * @param subscribe
	 * @param password
	 * @param address
	 */
	public RegisterBean(String userName, String email, List<String> alternateEmails, boolean subscribe, String password,
			Address address) {
		super();
		this.userName = userName;
		this.email = email;
		this.alternateEmails = alternateEmails;
		this.subscribe = subscribe;
		this.password = password;
		this.address = address;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the alternateEmails
	 */
	public List<String> getAlternateEmails() {
		return alternateEmails;
	}

	/**
	 * @param alternateEmails the alternateEmails to set
	 */
	public void setAlternateEmails(List<String> alternateEmails) {
		this.alternateEmails = alternateEmails;
	}

	/**
	 * @return the subscribe
	 */
	public boolean isSubscribe() {
		return subscribe;
	}

	/**
	 * @param subscribe the subscribe to set
	 */
	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
