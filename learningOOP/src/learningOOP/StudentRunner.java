package learningOOP;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("hiren", 84, 98, 99, 100); // when size of array is not fixed

		System.out.println(student);
		student.addMarks(67);
		System.out.println(student);
		student.removeMarkAtIndex(3);
		System.out.println(student);
	}

}
