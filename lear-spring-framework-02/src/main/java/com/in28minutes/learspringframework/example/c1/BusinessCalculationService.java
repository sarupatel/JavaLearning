package com.in28minutes.learspringframework.example.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@ComponentScan
@Service
public class BusinessCalculationService {

	private DataService dataService;

	public BusinessCalculationService(@Qualifier("mySQLDataService") DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retreiveData()).max().orElse(0);
	}
}
