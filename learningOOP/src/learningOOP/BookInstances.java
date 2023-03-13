package learningOOP;

public class BookInstances {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book(10);
		Book effectiveJava = new Book(5);
		Book cleanCode = new Book(15);

		artOfComputerProgramming.read();
		effectiveJava.read();
		cleanCode.read();

		// artOfComputerProgramming.setNoOfCopies(100);
		artOfComputerProgramming.increaseNoOfCopies(180);
		System.out
				.printf("The no of copies for Art of Computer Learning is %d", artOfComputerProgramming.getNoOfCopies())
				.println();
		artOfComputerProgramming.decreaseNoOfCopies(20);
		System.out
				.printf("The no of copies for Art of Computer Learning is %d", artOfComputerProgramming.getNoOfCopies())
				.println();


		// effectiveJava.setNoOfCopies(500);
		effectiveJava.increaseNoOfCopies(180);
		System.out.printf("The no of copies for Effective Java is %d", effectiveJava.getNoOfCopies()).println();
		effectiveJava.decreaseNoOfCopies(20);
		System.out.printf("The no of copies for Effective Java is %d", effectiveJava.getNoOfCopies()).println();

		// cleanCode.setNoOfCopies(200);
		cleanCode.increaseNoOfCopies(180);
		System.out.printf("The no of copies for Clean Code is %d", cleanCode.getNoOfCopies()).println();
		cleanCode.decreaseNoOfCopies(20);
		System.out.printf("The no of copies for Clean Code is %d", cleanCode.getNoOfCopies()).println();

	}

}
