package com.in8minutes.advancedJava;

public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Goes into a hole");
	}

	public void left() {
	}

	public void right() {
		System.out.println("Go forward");
	}
}
