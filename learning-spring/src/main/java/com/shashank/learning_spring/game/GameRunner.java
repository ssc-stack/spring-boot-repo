package com.shashank.learning_spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class GameRunner {
    private GamingConsole gamingConsole;

    public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole gamingConsole) {
        this.gamingConsole=gamingConsole;
    }

    public void run() {
        System.out.println("Game:"+gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }
}
