package com.shashank.learning_spring.game;

public class GameRunner {
    private GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole) {
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
