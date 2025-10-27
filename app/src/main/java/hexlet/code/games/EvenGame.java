package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class EvenGame {
    private static final int RANDOM_RATIO = 100;
    private static final int QUANTITY_FOR_WIN = 3;
    private static int quantityUsersStage = 0;
    private static int countUsersWin = 0;

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void startGame() {
        Engine.sayHello();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        while (quantityUsersStage < QUANTITY_FOR_WIN) {
            int random = (int) (Math.random() * RANDOM_RATIO);
            System.out.println("Question: " + random);
            Cli.inputAnswer();
            String userAnswer = Cli.getAnswer();
            //String userAnswer = scanner.nextLine();

            System.out.println("Your answer: " + userAnswer);

            if (isEven(random) && userAnswer.equals("yes")) {
                System.out.println("Correct!");
                countUsersWin++;
            } else if (!isEven(random) && userAnswer.equals("no")) {
                System.out.println("Correct!");
                countUsersWin++;
            } else if (isEven(random) && userAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                countUsersWin++;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
            }
            quantityUsersStage++;
        }

        if (countUsersWin == QUANTITY_FOR_WIN) {
            Engine.sayCongratulations();
        }
    }
}
