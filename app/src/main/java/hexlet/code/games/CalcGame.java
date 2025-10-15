package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class CalcGame {
    private static final int QUANTITY_FOR_WIN = 3;
    private static final int QUANTITY_OPERATIONS = 3;
    private static final int RANDOM_RANGE = 101;
    private static int quantityUsersStage = 0;
    private static int countUsersWin = 0;
    private static int firstNumber;
    private static int secondNumber;
    private static int expression;
    private static int result;

    public static void startGame() {
        Engine.sayHello();
        System.out.println("What is the result of the expression?");

        while (quantityUsersStage < QUANTITY_FOR_WIN) {
            expression = Engine.randomNumber(QUANTITY_OPERATIONS);
            firstNumber = Engine.randomNumber(RANDOM_RANGE);
            secondNumber = Engine.randomNumber(RANDOM_RANGE);

            switch (expression) {
                case (0):
                    System.out.println("Question: " + firstNumber + " + " + secondNumber);
                    result = firstNumber + secondNumber;
                    break;
                case (1):
                    System.out.println("Question: " + firstNumber + " - " + secondNumber);
                    result = firstNumber - secondNumber;
                    break;
                case (2):
                    System.out.println("Question: " + firstNumber + " * " + secondNumber);
                    result = firstNumber * secondNumber;
                    break;
                default:
                    break;
            }

            Cli.inputAnswer();
            int userAnswer = Integer.parseInt(Cli.getAnswer());
            System.out.println("Your answer: " + userAnswer);

            if (Engine.checkAnswerInt(userAnswer, result)) {
                System.out.println("Correct!");
                countUsersWin++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'.\n"
                        + "Let's try again, " + Cli.getName() + "!");
            }
            quantityUsersStage++;
        }

        if (countUsersWin == QUANTITY_FOR_WIN) {
            Engine.sayCongratulations();
        }
    }
}
