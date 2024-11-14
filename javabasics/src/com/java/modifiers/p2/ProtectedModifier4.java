package com.java.modifiers.p2;

import com.java.modifiers.p1.ProtectedModifier1;

public class ProtectedModifier4 {
	public static void main(String[] args) {
		ProtectedModifier1 p = new ProtectedModifier1();
		//p.display();  we can't access because it's in different package
	}
}
