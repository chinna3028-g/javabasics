package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();// Size 0, Capacity 0

		// Object[] elementData = {} -> Object[] elementData = new Object[0];
		list.add("Hello"); // Capacity 10, size 0 Object[] elementData = new Object[10]; elementData[0] =
							// "Hello"
		list.add("Hello");// Capacity 10, size 1 elementData[1] = "Hello"
		list.add("Hello");// Capacity 10, size 2 elementData[2] = "Hello"
		list.add("Hello");// Capacity 10, size 3 elementData[3] = "Hello"
		list.add("Hello");// Capacity 10, size 4 elementData[4] = "Hello"
		list.add("Hello");// Capacity 10, size 5 elementData[5] = "Hello"
		list.add("Hello");// Capacity 10, size 6 elementData[6] = "Hello"
		list.add("Hello");// Capacity 10, size 7 elementData[7] = "Hello"
		list.add("Hello");// Capacity 10, size 8 elementData[8] = "Hello"
		list.add("Hello");// Capacity 10, size 9 elementData[9] = "Hello"
		list.add("Hello");// Capacity 10, size 10 elementData[10] = "Hello"
		list.add("Hello");// Capacity 16, size 11 elementData[10] = "Hello"
		list.add("Hello");
		// Insertion Order Same
		// It will allow you to add Duplicates
		// Its Growable in nature
		// It allows you to use Generics

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			String str = (String)itr.next();
			System.out.print(str + ", ");
		}

	}
}
