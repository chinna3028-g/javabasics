package com.java.arrays;

public class StudentDetails {
	
	public int studentId;

	public String studentName;

	public int whichClass;

	public StudentDetails(int studentId, String studentName, int whichClass) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.whichClass = whichClass;
	}

	@Override
	public String toString() {
		return "Student Id:\t " + studentId + "\n Stduent Name:\t " + studentName + "\n Which Class:\t " + whichClass;
	}

}
