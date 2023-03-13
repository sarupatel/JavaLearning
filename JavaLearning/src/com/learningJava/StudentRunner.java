package com.learningJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Students> {
	public int compare(Students student1, Students student3) {
		return Integer.compare(student1.getId(), student3.getId());
	}
}
public class StudentRunner {

	public static void main(String[] args) {
		List<Students> students = List.of(new Students(1, "Sarita"), new Students(10, "Hiren"),
				new Students(3, "Dhyan"));
		List<Students> studentsAl = new ArrayList<>(students);

		System.out.println(studentsAl);

		Collections.sort(studentsAl);
		System.out.println("Desceding" + studentsAl);

		Collections.sort(studentsAl, new AscendingStudentComparator());
		// studentsAl.sort(new AscendingStudentComparator());
		System.out.println("Ascending" + studentsAl);
	}

}
