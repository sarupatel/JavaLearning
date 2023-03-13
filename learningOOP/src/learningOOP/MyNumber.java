package learningOOP;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int j = 0;
		for (int i = 1; i <= number; i++) {
			j = j + i;
		}
		return j;
	}
		
	public int sumOfDivisors() {
		int j = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				j = j + i;
			}
		}
		return j;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}



