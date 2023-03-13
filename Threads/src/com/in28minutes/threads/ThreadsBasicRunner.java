package com.in28minutes.threads;

class Task1 extends Thread {

	public void run() {
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask1 Done");
	}
}

class Task2 implements Runnable {
	public void run() {
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask2 Done");
	}
		
}


public class ThreadsBasicRunner {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Task1 Started");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start(); // this will run the program in Thread format, if we simply use task1.run() then
						// it will become regular execution

		System.out.println("Task2 Started");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2); // when implementing runnable interface, explicitly need to define
												// Thread
												// on the object
		task2Thread.setPriority(10);
		task2Thread.start();

		task1.join(); // Will wait for task1 thread to complete before moving ahead of the next set of
						// code.

		System.out.println("Task3 Started");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask3 Done");

	}

}
