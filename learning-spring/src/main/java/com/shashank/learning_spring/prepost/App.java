package com.shashank.learning_spring.prepost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class A {
    private Dependency dependency;

    public A(Dependency dependency) {
        this.dependency=dependency;
        System.out.println("Dependencies are ready");
    }

    @PostConstruct
    public void initialize() {
        dependency.getInitialization();
    }

    @PreDestroy
    public void clean() {
        System.out.println("Cleanup operations!");
    }
}

@Component
class Dependency {

    public void getInitialization() {
        System.out.println("getInitialization()");
    }
}

@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(App.class);
        System.out.println("Context initialization is completed!");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(A.class));
        context.close();
    }
}
