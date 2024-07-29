package com.shashank.learning_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingServiceController {

    @Autowired
    private BankingServiceConfiguration bankingServiceConfiguration;

    @RequestMapping("banking-service-config")
    public BankingServiceConfiguration getConfig() {
        return bankingServiceConfiguration;
    }
}
