package com.ty;

public class Test {

	public static void main(String[] args) {
		int a[] = new int[3];

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
//		System.out.println(a[3]);//AIOOB
		System.out.println("--------------------");
		a[0] = 20;
		a[1] = 30;
		a[2] = 40;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("======================");
		int[] b = { 10, 50, 100 };

		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);

		System.out.println("&&&&&&&&&&&&&&&&&");
		System.out.println("size "+b.length);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
