package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

public class ProgressionGame {
    private static final int RANDOM_QUESTION = 10;
    private static final int RANDOM_RANGE = 11;
    private static final int QUANTITY_FOR_WIN = 3;
    private static int quantityUsersStage = 0;
    private static int countUsersWin = 0;
    private static final int QUANTITY_ELEMENTS_OF_PROGRESSION = 10;

    public static void startGame() {
        Engine.sayHello();
        System.out.println("What number is missing in the progression?");

        while (quantityUsersStage < QUANTITY_FOR_WIN) {
            int firstNumber = Engine.randomNumber(RANDOM_RANGE);
            int differenceNumber = Engine.randomNumber(RANDOM_RANGE);
            int questionNumber = Engine.randomNumber(RANDOM_QUESTION);
            System.out.print("Question: ");
            List<Integer> prog = printArithmeticProgression(firstNumber, differenceNumber, questionNumber);
            int answer = prog.get(questionNumber);
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

    public static List<Integer> printArithmeticProgression(int first, int difference, int quest) {
        int elements = QUANTITY_ELEMENTS_OF_PROGRESSION;
        var temp = new ArrayList<Integer>();

        for (int i = 0; i < elements; i++) {
            int term = first + i * difference;
            temp.add(term);
            if (i != quest) {
                System.out.print(term + " ");
            } else {
                System.out.print(".." + " ");
            }
        }
        System.out.println();
        return temp;
    }
}
