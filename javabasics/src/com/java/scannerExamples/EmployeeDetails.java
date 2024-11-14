package com.java.scannerExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDetails {
	static Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int operation = 0;
		do {
			System.out.println(
					"Avilable Operations \n 1. Insert \n 2. Update \n 3. Delete \n 4. Retrive \n 5. Exit. Please Select Your Operation ");
			operation = sc.nextInt();
			switch (operation) {
			case 1:
				insertEmployee(sc);
				break;
			case 2:
				updateEmployee(sc);
				break;
			case 3:
				deleteEmplyee(sc);
				break;
			case 4:
				retrieveEmplyeeDetails();
				break;
			}

		} while (operation != 5);

	}

	public static void retrieveEmplyeeDetails() {
		System.out.println(empMap);
	}

	public static void insertEmployee(Scanner sc) {
		Employee emp = getEmployeeeDetails(sc, "Insert");
		empMap.put(emp.getEmpId(), emp);
	}

	public static void updateEmployee(Scanner sc) {
		Employee emp = getEmployeeeDetails(sc, "Update");
		empMap.put(emp.getEmpId(), emp);
	}

	public static void deleteEmplyee(Scanner sc) {
		System.out.println("Enter Emplyee Id");
		empMap.remove(sc.nextInt());
	}

	public static Employee getEmployeeeDetails(Scanner sc, String operation) {
		Employee emp = new Employee();

		if (operation.equalsIgnoreCase("Insert") || operation.equalsIgnoreCase("Update")) {
			System.out.println("Enter Emplyee Id");
			emp.setEmpId(sc.nextInt());
		}

		System.out.println("Enter Emplyee Name");
		emp.setEmpName(sc.next());

		System.out.println("Enter Emplyee Salary");
		emp.setSalary(sc.nextInt());

		System.out.println("Enter Emplyee Address");
		emp.setAddress(sc.next());

		System.out.println("Enter Emplyee Mobile No");
		emp.setMobileNo(sc.nextLong());

		System.out.println("Enter Emplyee age");
		emp.setAge(sc.nextInt());

		System.out.println("Enter Emplyee Geneder");
		emp.setGender(sc.next());

		return emp;
	}

}
