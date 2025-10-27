package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class PrimeGame {
    private static final int RANDOM_RANGE = 101;
    private static final int QUANTITY_FOR_WIN = 3;
    private static int quantityUsersStage = 0;
    private static int countUsersWin = 0;

    public static void startGame() {
        System.out.println();
        Engine.sayHello();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (quantityUsersStage < QUANTITY_FOR_WIN) {
            int questionNumber = Engine.randomNumber(RANDOM_RANGE);
            System.out.print("Question: " + questionNumber + "\n");
            Cli.inputAnswer();
            String userAnswer = Cli.getAnswer().toLowerCase().trim();

            boolean isAnswerCorrect = Engine.isPrime(questionNumber);

            if (isAnswerCorrect & userAnswer.equals("yes")) {
                System.out.println("Correct!");
                countUsersWin++;
            } else if (!isAnswerCorrect & userAnswer.equals("no")) {
                System.out.println("Correct!");
                countUsersWin++;
            } else if (isAnswerCorrect & userAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
            quantityUsersStage++;
        }

        if (countUsersWin == QUANTITY_FOR_WIN) {
            Engine.sayCongratulations();
        }
    }
}
