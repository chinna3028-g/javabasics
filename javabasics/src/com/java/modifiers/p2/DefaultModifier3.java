package com.java.modifiers.p2;

import com.java.modifiers.p1.DefaultModifier1;

public class DefaultModifier3 {
	public static void main(String[] args) {
		DefaultModifier1 d = new DefaultModifier1();
		//d.display(); We can't access. Because default property is not allowed outside package 
	}
}
