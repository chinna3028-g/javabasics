package com.java.scannerExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student st1 = getStudentData(sc);

		List<Student> list = new ArrayList<Student>();
		list.add(st1);

		Student st2 = getStudentData(sc);
		list.add(st2);

		Student st3 = getStudentData(sc);
		list.add(st3);
		
		System.out.println(list);
	}

	public static Student getStudentData(Scanner sc) {
		Student st = new Student();
		System.out.println("Enter Student Id: ");
		st.setStudentId(sc.nextInt());
		System.out.println("Enter Student Name: ");
		st.setStudentName(sc.next());
		System.out.println("Student Age: ");
		st.setAge(sc.nextInt());
		System.out.println("Enter Student studying Class");
		st.setWhichClass(sc.nextInt());
		System.out.println("Enter Student Mobile Number");
		st.setMobile(sc.nextLong());
		return st;
	}

}
