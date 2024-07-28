package com.shashank.learning_spring.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessClass {

    Dependency1 dependency1;


    Dependency2 dependency2;


    public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "BusinessClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
