package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCDGame {
    private static final int QUANTITY_FOR_WIN = 3;
    private static int quantityUsersStage = 0;
    private static int countUsersWin = 0;
    private static final int RANDOM_RANGE = 101;

    public static void startGame() {
        Engine.sayHello();
        System.out.println("Find the greatest common divisor of given numbers.");

        while (quantityUsersStage < QUANTITY_FOR_WIN) {
            int firstNumber = Engine.randomNumber(RANDOM_RANGE);
            int secondNumber = Engine.randomNumber(RANDOM_RANGE);

            System.out.println("Question: " + firstNumber + " " + secondNumber);
            int answer = gcd(firstNumber, secondNumber);

            Cli.inputAnswer();
            int userAnswer = Integer.parseInt(Cli.getAnswer());

            if (userAnswer == answer) {
                System.out.println("Correct!");
                countUsersWin++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            }
            quantityUsersStage++;
        }
        if (countUsersWin == QUANTITY_FOR_WIN) {
            Engine.sayCongratulations();
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
