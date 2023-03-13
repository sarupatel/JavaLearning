package learningOOP;

public class StringExamples {

	public static void main(String[] args) {

		String someString = "This is a lot of text again";

		int len = someString.length();

		for (int i = 0; i < len; i++) {
			System.out.println(someString.charAt(i));
		}

	}

}
