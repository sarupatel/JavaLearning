package learningOOP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArrayExamples {

	private String name;
	private int[] marks;

	// public ArrayExamples(String name, int[] marks) {
	public ArrayExamples(String name, int... marks) {
		this.name = name;
		this.marks = marks;

	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int sumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int maximumMark = 0;
		for (int mark : marks) {
			if (maximumMark < mark) {
				maximumMark = mark;
			}
		}
		return maximumMark;
	}

	public int getminimumMark() {
		int minimumMark = marks[0];
		for (int mark : marks) {
			if (minimumMark > mark) {
				minimumMark = mark;
			}
		}
		return minimumMark;
	}

	public BigDecimal getAverageMarks() {
		int sum = sumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

}
