package com.shashank.learning_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

record Student(String name,int age,Address address) {};

record Address(String address) {};

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public String name() {
        return "Shashank Chauhan";
    }

    @Bean
    public int age() {
        return 26;
    }

    @Bean("address1")
    @Primary
    public Address address1() {
        return new Address("USA");
    }

    @Bean("address2")
    @Qualifier("Address2")
    public Address address2() {
        return new Address("UK");
    }

    @Primary
    @Bean
    public Student student() {
        return new Student("Shashank",25,new Address("Delhi"));
    }

    @Bean
    public Student student2(String name,int age,@Qualifier("address2") Address address) {
        return new Student(name,age,address);
    }

    @Bean
    public Student student3(String name,int age,Address address) {
        return new Student(name,age,address);
    }
}
