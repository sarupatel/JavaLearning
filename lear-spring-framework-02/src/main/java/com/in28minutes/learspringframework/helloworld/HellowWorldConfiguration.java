package com.in28minutes.learspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address addr1) {
};

record Address(String firstLine, String City) {
};

@Configuration
public class HellowWorldConfiguration {

	@Bean
	public String name() {
		return "Sarita";
	}

	@Bean
	public int age() {
		return 39;
	}

	@Bean
	public Person person() {
		var person1 = new Person("Hiren", 40, new Address("Baker Street", "London"));
		return person1;

	}

	@Bean
	public Person person2MethodCall() {
		var person1 = new Person(name(), age(), addr());
		return person1;

	}

	@Bean
	public Person person3Parameters(String name, int age, Address addr2) {
		return new Person(name, age, addr2);
	}

	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("addr2qualifier") Address addr2) {
		return new Person(name, age, addr2);
	}

	@Bean(name = "addr2")
	@Qualifier("addr2qualifier")
	public Address addr() {
		var addr1 = new Address("New Ranip", "Ahmedabad");
		return addr1;

	}

	@Bean(name = "addr3")
	@Primary // This will help when we have more than one object of same class and being
				// referred in Spring Context by Class Name.
	public Address addr3() {
		var addr1 = new Address("Kabir Enclave", "Bopal");
		return addr1;

	}
}
