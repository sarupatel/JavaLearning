package learningOOP;

import java.util.Scanner;

public class SwitchExercises {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a day of the week:");
		System.out.println("0 - Sunday");
		System.out.println("1 - Monday");
		System.out.println("2 - Tuesday");
		System.out.println("3 - Wednesday");
		System.out.println("4 - Thursday");
		System.out.println("5 - Friday");
		System.out.println("6 - Saturday");
		int dayNumber = scanner.nextInt();
		System.out.println(isWeekday(dayNumber));
		System.out.println(determineNameOfDay(dayNumber));
		System.out.println("Enter a month of choice:");
		System.out.println("1 - January");
		System.out.println("2 - February");
		System.out.println("3 - March");
		System.out.println("4 - April");
		System.out.println("5 - May");
		System.out.println("6 - June");
		System.out.println("7 - July");
		System.out.println("8 - August");
		System.out.println("9 - September");
		System.out.println("10 - October");
		System.out.println("11 - November");
		System.out.println("12 - December");
		int monthNumber = scanner.nextInt();
		System.out.println(determineNameOfMonth(monthNumber));

	}

	public static boolean isWeekday(int dayNumber) {
		if (dayNumber >= 0 && dayNumber <= 6) {
		switch (dayNumber) {
		case 0:
			return false;
		case 6:
			return false;
		default:
			return true;
		}
	} else
		return false;
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid";
		}
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Invalid";
		}
	}
}
