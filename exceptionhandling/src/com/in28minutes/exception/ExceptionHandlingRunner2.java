package com.in28minutes.exception;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended");

	}

	private static void method1() {
		try {
			method2();
		int[] i = { 1, 2 };
		int number = i[3];
		System.out.println("Method1 ended");
	} catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("ArrayIndexOutOfBounds");
		ex.printStackTrace();
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}

	private static void method2() {
		try {
			String str = null;
			str.length();
			System.out.println("Method2 ended");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
