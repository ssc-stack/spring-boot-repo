package com.shashank.learning_spring.initialization_types;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class A {

}

@Component
class B {
    private A a;

    public B(A a) {
        System.out.println("Initialization of B is started!");
        this.a=a;
    }
}


@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(App.class);
    }
}
