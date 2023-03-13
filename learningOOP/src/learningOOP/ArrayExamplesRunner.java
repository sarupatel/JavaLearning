package learningOOP;

import java.math.BigDecimal;

public class ArrayExamplesRunner {

	public static void main(String[] args) {
		// int[] marks = { 75, 87, 95 };
		// ArrayExamples array = new ArrayExamples("sarita", new int[] { 75, 87, 95 });
		ArrayExamples array1 = new ArrayExamples("hiren", 84, 98, 99, 100); // when size of array is not fixed
		
		int number = array1.getNumberOfMarks();
		int sum = array1.sumOfMarks();
		int maximumMarks = array1.getMaximumMark();
		int minimumMarks = array1.getminimumMark();
		BigDecimal average = array1.getAverageMarks();
		System.out.println("Number of marks " + number);
		System.out.println("Sum of Marks " + sum);
		System.out.println("Maximum Marks " + maximumMarks);
		System.out.println("Minimum Marks " + minimumMarks);
		System.out.println("Average Marks " + average);
	}

}
