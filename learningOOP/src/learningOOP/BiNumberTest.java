package learningOOP;

public class BiNumberTest {

	public static void main(String[] args) {

		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubles();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
