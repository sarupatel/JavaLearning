package learningOOP;

public class StringArrayRun {

	public static void main(String[] args) {

		StringArray array = new StringArray("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday");

		System.out.println("Longest week name " + array.longestName());
		array.printBackward();
	}

}
