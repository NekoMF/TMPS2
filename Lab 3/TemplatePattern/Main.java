package TemplatePattern;

public class Main {
    public static void main(String args[]) {

        Game game = new Basketball();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
