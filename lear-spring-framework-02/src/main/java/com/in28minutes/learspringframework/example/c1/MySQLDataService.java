package com.in28minutes.learspringframework.example.c1;

import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService {

	public int[] retreiveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
