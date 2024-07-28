package com.shashank.learning_spring.examples.datalayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(App.class);
        System.out.println(context.getBean(BusinessService.class).maximumValue());
    }
}
