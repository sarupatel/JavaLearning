package learningOOP;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {

		this.limit = limit;
	}

	public void printSquareUptoLimit() {
		int i = 1;
		int j = 1;
		while (j < limit) {
			System.out.print(j + " ");
			i++;
			j = i * i;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int i = 1;
		int j = 1;
		while (j < limit) {
			System.out.print(j + " ");
			i++;
			j = i * i * i;
		}
	}

}
