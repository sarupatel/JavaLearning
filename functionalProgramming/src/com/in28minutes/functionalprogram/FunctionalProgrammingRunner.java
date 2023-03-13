package com.in28minutes.functionalprogram;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "Bat");
		List<Integer> list1 = List.of(1, 4, 7, 9);
		// printBasic(list);
		printWithFP(list);
		//printBasicWithFiltering(list);
		printWithFPWithFiltering(list);
		printWithFPEvenNumbers(list1);
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("filteredElement - " + element));
	}

	private static void printWithFPEvenNumbers(List<Integer> list) {
		list.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("Even number - " + element));
	}
}
