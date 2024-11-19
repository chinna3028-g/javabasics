package com.employee.exceptions;

public class EmplyeeDAOException extends Exception {
	public EmplyeeDAOException() {
		super();
	}

	public EmplyeeDAOException(String msg) {
		super(msg);
	}

	public EmplyeeDAOException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
