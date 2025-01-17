package learningOOP;

import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public void addMarks(int number) {
		this.marks.add(number);

	}

	public void removeMarkAtIndex(int index) {
		this.marks.remove(index);
	}

	public String toString() {
		return name + marks;
	}
}
