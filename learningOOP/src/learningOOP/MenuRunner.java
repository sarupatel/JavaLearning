package learningOOP;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter Number : ");
		int number2 = scanner.nextInt();
		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println();
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		// performOperationUsingIfElse(number1, number2, choice);
		performOperationUsingSwitch(number1, number2, choice);
	}

	private static void performOperationUsingIfElse(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.printf("Addition of %d and %d is %d", number1, number2, number1+number2).println();
		} else if (choice == 2) {
			System.out.printf("Subsctraction of %d and %d is %d", number1, number2, number1-number2).println();
		} else if (choice == 3) {
			System.out.printf("Multiplication of %d and %d is %d", number1, number2, number1*number2).println();
		} else if (choice == 4) {
			System.out.printf("Division of %d and %d is %d", number1, number2, number1/number2).println();
		} else {
			System.out.println("You have not chosen from the given options !!");
		}
	}

	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.printf("Addition of %d and %d is %d", number1, number2, number1 + number2).println();
			break;
		case 2:
			System.out.printf("Addition of %d and %d is %d", number1, number2, number1 - number2).println();
			break;
		case 3:
			System.out.printf("Multiplication of %d and %d is %d", number1, number2, number1 * number2).println();
			break;
		case 4:
			System.out.printf("Division of %d and %d is %d", number1, number2, number1 / number2).println();
			break;
		default:
			System.out.println("You have not chosen from the given options !!");
		}
	}

}
