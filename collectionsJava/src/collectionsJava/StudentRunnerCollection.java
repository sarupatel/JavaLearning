package collectionsJava;

import java.util.List;

public class StudentRunnerCollection {

	public static void main(String[] args) {
		List<Students> students = List.of(new Students(1, "Sarita"), new Students(10, "Hiren"));
		System.out.println(students);
	}

}
