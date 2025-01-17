package com.in28minutes.learspringframework.example.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}

	// @Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
		System.out.println("Setter Initialization");
	}

}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}
	}

}
