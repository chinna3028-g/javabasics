package com.java.interfaceEx;

public class ExampleOneAbstr extends AbstractClass {

	ExampleOneAbstr(int studentId) {
		super(studentId);
	}


	public static void main(String[] args) {
		AbstractClass a = new ExampleOneAbstr(100);
		System.out.println(a.stundeId);
		a.sum();
	}


	@Override
	public void sum() {
		System.out.println("Sum");
	}

	public void multi() {
	}
	
	public void display() {
		
	}
}
