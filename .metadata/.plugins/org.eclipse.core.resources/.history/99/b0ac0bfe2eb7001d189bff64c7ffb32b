package com.in28minutes.learspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learspringframework.game.GameRunner;
import com.in28minutes.learspringframework.game.GameRunnerSpringBeans;

public class App03GamingSpringFramework {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GameRunnerSpringBeans.class)) {

//			context.getBean(GamingConsole.class).up;
			context.getBean(GameRunner.class).run();
		}
	}

}
