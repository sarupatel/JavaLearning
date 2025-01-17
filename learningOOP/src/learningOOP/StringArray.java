package learningOOP;

public class StringArray {

	private String[] daysOfWeek;

	public StringArray(String... daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public String longestName() {
		int longestWeekDay = 0;
		String dayName = "";

		for (int i = 0; i < daysOfWeek.length; i++) {
			if (longestWeekDay < daysOfWeek[i].length()) {
				longestWeekDay = daysOfWeek[i].length();
				dayName = daysOfWeek[i];
			}
		}
		return dayName;
	}

	public void printBackward() {

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
