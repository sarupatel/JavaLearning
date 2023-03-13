package com.in28minutes.learspringframework.game;

public class PacmanGame implements GamingConsole {

	public void up() {
		System.out.println("Going up");
	}

	public void down() {
		System.out.println("Going down");
	}

	public void left() {
		System.out.println("Moving left");
	}

	public void right() {
		System.out.println("Moving right");
	}
}
