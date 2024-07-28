package com.shashank.learning_spring.examples.datalayer;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

public class BusinessService {
    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService=dataService;
    }

    public int maximumValue() {
        return Arrays.stream(dataService.getNumbers()).max().orElse(0);
    }
}
