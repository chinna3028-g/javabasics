package com.java.scannerExamples;

public class Student {

	private int studentId;
	private String studentName;
	private int age;
	private int whichClass;
	private float fee;
	private long mobile;

	public int getStudentId() {
		return studentId;
	}

	// setStudentId

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getWhichClass() {
		return whichClass;
	}

	public void setWhichClass(int whichClass) {
		this.whichClass = whichClass;
	}

	@Override
	public String toString() {
		return "Student Id: " + studentId + ", Student Name: " + studentName + ", Student Age: " + age
				+ ", Student studying in " + whichClass + " class and Student Mobile: " + mobile;
	}
}
