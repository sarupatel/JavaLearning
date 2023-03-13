package com.in28minutes.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {

		System.out.println("Task " + number + " Started");
		for (int i = number * 100; i <= number * 100 + 99; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("Task " + number + " Done");
}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor(); //
		// Allows only 1 thread to execute at a
																				// time
		ExecutorService executorService = Executors.newFixedThreadPool(2); // Allows 2 thread to execute

		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		//executorService.execute(new Thread(new Task2()));
		
		executorService.shutdown();

	}
}
