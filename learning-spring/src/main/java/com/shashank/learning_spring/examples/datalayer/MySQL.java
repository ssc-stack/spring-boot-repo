package com.shashank.learning_spring.examples.datalayer;

import org.springframework.stereotype.Component;

@Component
public class MySQL implements DataService {
    @Override
    public int[] getNumbers() {
        return new int[]{1,2,3,4,5,6};
    }
}
