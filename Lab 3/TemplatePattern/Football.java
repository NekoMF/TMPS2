package TemplatePattern;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football game initialized.");
    }
    @Override
    void startGame() {
        System.out.println("Football game started.");
    }

    @Override
    void endGame() {
        System.out.println("Football game finished.");
    }

}
