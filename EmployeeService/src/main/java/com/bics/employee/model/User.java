/**
 * 
 */
package com.bics.employee.model;

/**
 * @author bosco
 *
 */
public class User {
	
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String topic;
	private String timePreference;
	private boolean subscribe;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone
	 * @param topic
	 * @param timePreference
	 * @param subscribe
	 */
	public User(Integer id, String name, String email, String phone, String topic, String timePreference,
			boolean subscribe) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.topic = topic;
		this.timePreference = timePreference;
		this.subscribe = subscribe;
	}



	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @return the timePreference
	 */
	public String getTimePreference() {
		return timePreference;
	}

	/**
	 * @param timePreference the timePreference to set
	 */
	public void setTimePreference(String timePreference) {
		this.timePreference = timePreference;
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
	
	
}
