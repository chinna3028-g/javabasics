package com.java.modifiers.p2;

import com.java.modifiers.p1.*;

public class PublicModifier2 extends PublicModifier{
	public static void main(String[] args) {
		PublicModifier p= new PublicModifier();
		System.out.println("Stock Id: "+p.stockId);
		p.display();
	}
}
