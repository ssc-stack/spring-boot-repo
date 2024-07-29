package com.shashank.learning_spring_boot;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "banking")
@Setter
@Getter
public class BankingServiceConfiguration {
    private String username;
    private String url;
}
