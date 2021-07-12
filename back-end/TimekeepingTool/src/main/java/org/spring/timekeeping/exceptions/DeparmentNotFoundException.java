package org.spring.timekeeping.exceptions;

public class DeparmentNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DeparmentNotFoundException(String message) {
		super(message);
	}
}
