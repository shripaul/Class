package com.calculator;

public class FunctionWithReturnType {
	public static void main(String[] args) {
		int a = add(5, 5) + 50;
		System.out.println("Main function result" + a);
		int b = add(5, 5) - 20;
		System.out.println(b);
		int r = b * 100;
		System.out.println(r);

		mult(1, 2, 3, 4, 5);
		bla();

	}

	public static int add(int a, int b) {
		int c = a + b;
		System.out.println("Add function result" + c);
		return c;
	}

	public static void mult(int q, int w, int e, int r, int t) {
		int a = q * w * e * r * t;
		System.out.println(a);
	}

	public static void bla() {
		int a = 4;
		int b = 9;
		int c = a + b;
		System.out.println(b);
	}

}
