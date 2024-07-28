package com.shashank.learning_spring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.shashank.learning_spring.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        GameRunner gameRunner= (GameRunner) context.getBean("gameRunner");
        gameRunner.run();
    }
}
