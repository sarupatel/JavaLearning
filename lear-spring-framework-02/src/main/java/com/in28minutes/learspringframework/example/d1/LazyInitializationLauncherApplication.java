package com.in28minutes.learspringframework.example.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Initializing Class A");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Do Something");
	}
}
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {

			System.out.println("Context Initialization is complete");

			context.getBean(ClassB.class).doSomething();
		}
	}

}
