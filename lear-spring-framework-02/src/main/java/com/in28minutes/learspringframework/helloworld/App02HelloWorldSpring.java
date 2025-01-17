package com.in28minutes.learspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HellowWorldConfiguration.class);

		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("addr2"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person4Qualifier"));
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		context.close();

	}

}
