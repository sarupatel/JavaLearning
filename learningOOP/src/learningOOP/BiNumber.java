package learningOOP;

public class BiNumber {

	private int firstNumber;
	private int secondNumber;

	BiNumber(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	int add() {
		return firstNumber + secondNumber;
	}

	int multiply() {
		return firstNumber * secondNumber;
	}
	
	void doubles() {
		firstNumber = firstNumber * firstNumber;
		secondNumber = secondNumber * secondNumber;
	}
	
	int getNumber1() {
		return firstNumber;
	}

	int getNumber2() {
		return secondNumber;
	}

}
