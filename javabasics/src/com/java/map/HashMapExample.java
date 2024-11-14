package com.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList();
		l.add("hey1");
		l.add("hey2");
		l.add("hey3");
		l.add("hey4");
		l.add("hey5");
		l.add("hey6");
		l.set(4, "Hey10");

		ArrayList<String> clone = (ArrayList<String>) l.clone();

		l.contains("hey1");

		System.out.println(l);

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Ram"); // Entry e = new Entry(k, v, null);
		m.put(2, "Sita");
		m.put(3, "lakshman");
		m.put(4, "Anjaneya");
		m.put(5, "God");
		m.put(5, "Hello");
		m.put(null, "hellllllooo1");
		m.put(null,null);
		System.out.println(m);

	}
}
