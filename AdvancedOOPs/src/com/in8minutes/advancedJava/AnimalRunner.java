package com.in8minutes.advancedJava;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal[] animals = {new Dog(), new Cat()};

		for (Animal ani : animals) {
			ani.bark();
		}
		}

	}

