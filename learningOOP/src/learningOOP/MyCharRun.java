package learningOOP;

public class MyCharRun {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('b');
			System.out.println(myChar.isVowel());
			System.out.println(myChar.isConsonant());
			System.out.println(myChar.isNumber());
			System.out.println(myChar.isAlphabet());
			MyChar.printLowerCaseAlphabets(); // static methods are called directly using class name
			MyChar.printUpperCaseAlphabets();

		}

}
