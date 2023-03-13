package com.in28minutes.functionalprogram;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15, 4, 13);
		int sum = numbers.stream().filter(element -> element % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2); // reduce function reduces the
																						// numbers in the list and adds
																						// them together
		System.out.println("Sum : " + sum);

		numbers.stream().sorted().distinct().forEach(e -> System.out.println(e));
		numbers.stream().distinct().map(e -> e * e).forEach(e -> System.out.println(e)); // square of the numbers are
																						// printed

		IntStream.range(1, 11).forEach(e -> System.out.println(e * e)); // Prints the square of first 10 integers.
		// List<String> string = List.of("Apple", "Bat", "Cat", "Dog");
				
		List.of("Apple", "Bat", "Cat", "Dog").stream().map(e -> e.length()).forEach(e -> System.out.println(e));

		List.of("Apple", "Bat", "Cat", "Dog").stream().forEach(e -> System.out.println(e.length()));

		List.of("Apple", "ANT", "Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();

		IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList()); // List of squares of first 10
																						// integers
	}

}
