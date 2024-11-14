package com.java.polymorphism;

public class GenericServlet extends Servlet {
	public void service(int a) {
		System.out.println("This is Servlet method");
	}
	
	public void service() {
		System.out.println("This is Servlet method");
	}
}
