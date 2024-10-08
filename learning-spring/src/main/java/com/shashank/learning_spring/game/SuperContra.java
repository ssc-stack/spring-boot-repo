package com.shashank.learning_spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {

    @Override
    public void up() {
        System.out.println("SuperContra up");
    }

    @Override
    public void down() {
        System.out.println("SuperContra down");
    }

    @Override
    public void left() {
        System.out.println("SuperContra left");
    }


    @Override
    public void right() {
        System.out.println("SuperContra right");
    }
}
