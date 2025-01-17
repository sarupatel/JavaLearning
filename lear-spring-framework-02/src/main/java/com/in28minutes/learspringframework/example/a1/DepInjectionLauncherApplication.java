package com.in28minutes.learspringframework.example.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

//	@Autowired // field level injection
	Dependency1 dependency1;

//	@Autowired
	Dependency2 dependency2;

	// @Autowired // @Autowired keyword is not required for Constructor injection
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Using Constructor injection - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	/*
	 * @Autowired // setter injection public void setDependency1(Dependency1
	 * dependency1) { System.out.println("Using setter injection - setDependency1");
	 * this.dependency1 = dependency1; }
	 * 
	 * @Autowired // setter injections public void setDependency2(Dependency2
	 * dependency2) { System.out.println("Using setter injection - setDependency2");
	 * this.dependency2 = dependency2; }
	 */
	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {



	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}

}
