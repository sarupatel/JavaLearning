package com.in28minutes.concurrency;

public class Counter {

	private int i = 0;

	synchronized public void increment() { // synchronized keyword is used to make sure that the value of i is Thread
											// safe.
		i++;
	}

	public int getI() {
		return i;
	}
}
