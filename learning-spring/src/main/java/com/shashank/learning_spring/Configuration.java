package com.shashank.learning_spring;

import org.springframework.context.annotation.Bean;

record Student(String name,int age) {};

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public String name() {
        return "shashank";
    }

    @Bean
    public Student student() {
        return new Student("Shashank",25);
    }
}
