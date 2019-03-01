/**
 * 
 */
package com.bics.employee.model;

import java.util.Date;

/**
 * @author bosco
 *
 */
public class ResponseEntity {
	
	private String message;
	private String status;
	private Date timestamp;
	
	public ResponseEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param message
	 * @param status
	 * @param timestamp
	 */
	public ResponseEntity(String message, String status, Date timestamp) {
		super();
		this.message = message;
		this.status = status;
		this.timestamp = timestamp;
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
