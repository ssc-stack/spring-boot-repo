package com.shashank.learning_spring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainWithSpringBeans {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        GameRunner gameRunner= (GameRunner) context.getBean("gameRunner");
        gameRunner.run();
    }
}
