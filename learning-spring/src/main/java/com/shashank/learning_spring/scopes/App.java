package com.shashank.learning_spring.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class A {

}

@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class B {

}


@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(App.class);
        System.out.println("Context initialization is completed!");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        /*Singleton Object */
        System.out.println(context.getBean(A.class));
        System.out.println(context.getBean(A.class));
        System.out.println(context.getBean(A.class));
        System.out.println(context.getBean(A.class));


        /* Different Object */
        System.out.println(context.getBean(B.class));
        System.out.println(context.getBean(B.class));
        System.out.println(context.getBean(B.class));
        System.out.println(context.getBean(B.class));

    }
}
