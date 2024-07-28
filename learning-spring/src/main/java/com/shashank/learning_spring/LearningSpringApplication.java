package com.shashank.learning_spring;

import com.shashank.learning_spring.game.GameRunner;
import com.shashank.learning_spring.game.Mario;
import com.shashank.learning_spring.game.PacMan;
import com.shashank.learning_spring.game.SuperContra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
		Mario mario=new Mario();
		PacMan pacMan=new PacMan();
		SuperContra superContra=new SuperContra();
		GameRunner gameRunner=new GameRunner(pacMan);
		gameRunner.run();

		AnnotationConfigApplicationContext annotationConfigApplicationContext=
				new AnnotationConfigApplicationContext(Configuration.class);
		System.out.println(annotationConfigApplicationContext.getBean("student"));
		System.out.println(annotationConfigApplicationContext.getBean("name"));

		Arrays.stream(annotationConfigApplicationContext.getBeanDefinitionNames()).
				forEach(System.out::println);
		System.out.println(annotationConfigApplicationContext.getBeanDefinitionCount());

	}

}
