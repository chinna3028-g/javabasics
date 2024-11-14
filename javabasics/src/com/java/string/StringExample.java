package com.java.string;

//Object
public class StringExample {
	public static void main(String[] args) {
		String str = "Hey Java";
		String str1 = "Hey Java";
		//
		System.out.println(str.length());

		System.out.println(str.indexOf("Java"));

		System.out.println(str.indexOf(100)); // indexOf(int ch)

		System.out.println(str.indexOf(97, 8)); // indexOf(int ch)

		System.out.println(str.concat(" Welcome "));

		str = " Welcome " + ""; // "Hey Java" + " Welcome " = "Hey Java Welcome "

		System.out.println(str.charAt(0));
		
		System.out.println(str.split(" "));
		
		//chars, compareTo 
				

		// System.out.println(str.);
		
		

	}
}
