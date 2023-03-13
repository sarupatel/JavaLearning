package com.in28minutes.exception;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		try {
			someOtherFunction();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void someOtherFunction() throws InterruptedException {
		Thread.sleep(2000);
	}

}
