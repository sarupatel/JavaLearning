package learningOOP;

public class Book {

	private int noOfCopies; // member variable of the class

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) { // local variable to the method
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void increaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies + howMany);
	}

	public void decreaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies - howMany);
	}

	public void read() {

		System.out.println("Started reading Book");
		
	}

}
