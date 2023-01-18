package TemplatePattern;

public class Basketball extends Game{
    @Override
    void initialize() {
        System.out.println("Basketball game initialized.");
    }
    @Override
    void startGame() {
        System.out.println("Basketball game started.");
    }
    @Override
    void endGame() {
        System.out.println("Basketball game finished.");
    }
}
