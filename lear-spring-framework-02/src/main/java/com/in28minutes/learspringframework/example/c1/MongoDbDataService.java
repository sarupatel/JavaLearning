package com.in28minutes.learspringframework.example.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataService implements DataService {

	public int[] retreiveData() {
		return new int[] { 11, 22, 33, 44, 55 };
	}

}
