package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysExample {
	public static void main(String[] args) {
		// first format for creating arrays
		// Declaring and assigning values
		int[] ab = { 10, 11, 15, 19 }; // 16bytes
		System.out.println(ab[3]); // ArrayIndexOutofBoundsException
		float[] f = { 10.6f, 19.0f };
		char[] c = { 'a', 'b' };
		int[] bc = {};
		String[] str = { "Hello", "Hey", "Hai" };
		// Second format -> using new keyword.

		String[] str1 = new String[20];

		Object[] obj = new Object[20];

		obj[0] = new StudentDetails(100, "Hari", 10);
		obj[1] = new StudentDetails(100, "Hari", 10);
		obj[2] = new StudentDetails(100, "Hari", 10);
		obj[3] = new StudentDetails(100, "Hari", 10);
		obj[4] = new StudentDetails(100, "Hari", 10);
		obj[5] = new StudentDetails(100, "Hari", 10);
		obj[6] = new StudentDetails(100, "Hari", 10);
		obj[7] = new StudentDetails(100, "Hari", 10);
		obj[8] = new StudentDetails(100, "Hari", 10);
		obj[9] = new StudentDetails(100, "Hari", 10);
		obj[10] = new StudentDetails(100, "Hari", 10);
		obj[11] = new StudentDetails(100, "Hari", 10);
		obj[12] = new StudentDetails(100, "Hari", 10);
		
		//Collections
		//It supports Growable in Size
		//It Supports Generics
		
		
		
		
		
		

		
	}
}
