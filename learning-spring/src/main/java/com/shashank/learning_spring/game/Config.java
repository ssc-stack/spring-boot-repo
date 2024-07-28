package com.shashank.learning_spring.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public GamingConsole gamingConsole() {
        return new PacMan();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole gamingConsole) {
        return new GameRunner(gamingConsole);
    }
}
