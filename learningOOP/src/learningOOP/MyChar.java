package learningOOP;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;
		else
			return false;
	}

	public boolean isNumber() {
		if (ch > 47 && ch < 58)
			return true;
		else
			return false;
	}

	public boolean isAlphabet() {
		if ((ch > 96 && ch < 123) || (ch > 64 && ch < 91))
			return true;
		else
			return false;
	}

	public static void printLowerCaseAlphabets() {
		for (int i=97; i<=122; i++)
			System.out.println((char) i);

	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.println(ch);
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel())
			return true;
		else
			return false;

	}

}
