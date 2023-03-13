package com.in8minutes.advancedJava;

public class FlyableRunner {

	public static void main(String[] args) {

		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };

		for (Flyable object : flyingObjects) {
			object.fly();
			}
	}

}
