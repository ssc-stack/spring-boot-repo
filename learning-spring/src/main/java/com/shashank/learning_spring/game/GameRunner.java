package com.shashank.learning_spring.game;

public class GameRunner {
    private Mario mario;

    public GameRunner(Mario mario) {
        this.mario=mario;
    }

    public void run() {
        System.out.println("Game:"+mario);
        mario.up();
        mario.down();
        mario.left();
        mario.right();
    }
}
