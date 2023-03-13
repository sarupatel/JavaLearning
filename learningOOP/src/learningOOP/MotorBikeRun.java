package learningOOP;

public class MotorBikeRun {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(80);
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();

		// ducati.setSpeed(100);
		ducati.increaseSpeed(100);
		System.out.printf("Speed of Ducati is %d", ducati.getSpeed()).println();
		ducati.decreaseSpeed(50);
		System.out.printf("Speed of Ducati is %d", ducati.getSpeed()).println();

		// honda.setSpeed(80);
		honda.increaseSpeed(100);
		System.out.printf("Speed of Honda is %d", honda.getSpeed()).println();
		honda.decreaseSpeed(250);
		System.out.printf("Speed of Honda is %d", honda.getSpeed()).println();
		honda.decreaseSpeed(80);
		System.out.printf("Speed of Honda is %d", honda.getSpeed()).println();
	}

}
