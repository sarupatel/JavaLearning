package com.in28minutes.exception;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[5];
		} // Here we do not need to call finally to close scanner as this format closes
			// the scanner automatically

	}

}
