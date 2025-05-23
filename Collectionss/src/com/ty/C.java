package com.ty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C {
	public static void main(String[] args) {
		List<Double> al = new ArrayList<Double>();

		al.add(10.5);
		al.add(50.0);
		al.add(60.4);

		for (Double double1 : al) {
			System.out.println(double1);
		}

		System.out.println("Removed : " + al.remove(0));

		for (Double double1 : al) {
			System.out.println(double1);
		}

		System.out.println("----------------------");

		List<String> arraList = Arrays.asList("A", "B", "C", "D");
		System.out.println("before removing");
		for (String a : arraList) {
			System.out.println(a);
		}

	}
}
