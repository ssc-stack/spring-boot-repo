package com.shashank.learning_spring.examples.datalayer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDB implements DataService {
    @Override
    public int[] getNumbers() {
        return new int[]{11,22,100,11,111,2032,-2};
    }
}
