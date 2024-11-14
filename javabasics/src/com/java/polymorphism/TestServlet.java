package com.java.polymorphism;

public class TestServlet {
	public static void main(String[] args) {
		Servlet servlet1 = new GenericServlet();
		System.out.println(servlet1.servletId);

	}
}
