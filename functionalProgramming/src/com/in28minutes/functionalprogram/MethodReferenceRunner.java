package com.in28minutes.functionalprogram;

import java.util.List;

public class MethodReferenceRunner {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
	public static void main(String[] args) {
		List.of("Ant", "Apple", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		List.of("Ant", "Apple", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(System.out::println);
		// Syntax for Method references Class_Name::function_name

		Integer max = List.of(23, 45, 66, 34).stream().filter(MethodReferenceRunner::isEven).max(Integer::compare)
				.orElse(0);
		System.out.println(max);
	}

}
