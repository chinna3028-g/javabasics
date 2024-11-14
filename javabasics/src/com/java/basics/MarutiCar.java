package com.java.basics;

class Product{
	String productType ;
	String carName;
	
	public void displayCarDetails() {
		System.out.println("Product Is :");
	}

}

class Car extends Product{
	String carName;
	int carPrice;
	
	public void displayCarDetails() {
		System.out.println("Car Details :");
	}
}

class HundaiCar extends Car{
	public static void main(String[] args) {
		Car car = new MarutiCar();
		car.carName = "Maruthi Suziki Baleno";
		car.carPrice = 120000;
		car.productType = "Manual";
		car.displayCarDetails();
	}
}

public class MarutiCar extends Car{
	public static void main(String[] args) {
		Car car = new MarutiCar();
		car.carName = "Maruthi Suziki Baleno";
		car.carPrice = 120000;
		car.productType = "Manual";
		car.displayCarDetails();
	}
}


// SIngle Inheritance ->	One Parent & One Child
//Hierarchical Inheritance ->	One Parent & Multiple Child's
//MultiLevel Inheritance ->	Super Parent, Parent & Multiple Child's | One Child 
// Multiple Inheritance -> One Child with Multiple Parents -> This is not possible in Java