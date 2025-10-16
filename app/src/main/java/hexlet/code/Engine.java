package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;

import java.util.Random;

public class Engine {
    private static final int GREET_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    //private static final int EXIT = 0;

    public static void startGame() {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
        Cli.inputGame();
        System.out.println("Your choice: " + Cli.getGame());

        switch (Cli.getGame()) {
            case GREET_GAME:
                Engine.sayHello();
                break;
            case EVEN_GAME:
                EvenGame.startGame();
                break;
            case CALC_GAME:
                CalcGame.startGame();
                break;
            case GCD_GAME:
                GCDGame.startGame();
                break;
            default:
                break;
        }
    }

    public static void sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Cli.inputName();
        System.out.println("Hello, " + Cli.getName() + "!");
    }

    public static int randomNumber(int seed) {
        return new Random().nextInt(seed);
    }

    public static boolean checkAnswerInt(int answer, int correctAnswer) {
        return answer == correctAnswer;
    }

    public static void sayCongratulations() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
