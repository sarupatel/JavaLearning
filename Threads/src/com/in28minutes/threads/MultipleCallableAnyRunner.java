package com.in28minutes.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableAnyRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> task = List.of(new CallableTask("Sarita"), new CallableTask("Hiren"),
				new CallableTask("Dhyan"));
		String result = executorService.invokeAny(task);

		System.out.println(result);
		executorService.shutdown();
	}

}
