package com.java.interfaceEx;

public abstract class AbstractClass implements InterfaceEx {

	int stundeId = 101;

	AbstractClass(int studentId) {
		this.stundeId = studentId;
	}

	public abstract void sum();

	@Override
	public void sub() {
	}

	@Override
	public void multi() {
	}

}
