package com.ty;

import java.util.ArrayList;
import java.util.List;

public class B {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();

		a.add("Hi");
		a.add("Hello");
		a.add("Good");
		
		System.out.println(a.size());

		System.out.println(a.get(0));
		System.out.println(a.get(1));
		
		System.out.println("===========================");
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("_________________________");
		
		for(String b : a) {
			System.out.println(b);
		}
	}
}
