package learningOOP;

public class MotorBike {

	private int speed;

	MotorBike() {
		this(65); // calling MotorBike constructor with int parameter.
	}

	// This is a constructor of class MotorBike. It need not have a return Type and
	// its name is same as class name.
	MotorBike(int speed) {
		this.speed = speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getSpeed() {
		return speed;
	}

	void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	void decreaseSpeed(int howMuch) {
		if (howMuch < this.speed)
		this.speed = this.speed - howMuch;
	}

	void start() {
		System.out.println("Bike Started");
	}

}
