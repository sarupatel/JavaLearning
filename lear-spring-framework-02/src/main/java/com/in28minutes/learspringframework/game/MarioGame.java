package com.in28minutes.learspringframework.game;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("MarioGameQualifier")
public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Move up");
	}

	public void down() {
		System.out.println("Move down");
	}

	public void left() {
		System.out.println("Go left");
	}

	public void right() {
		System.out.println("Go Right");
	}
}
