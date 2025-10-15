package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;
    private static String answer;
    private static int game;
    private static Scanner scanner = new Scanner(System.in);

    public static void inputName() {
        name = scanner.nextLine();
    }

    public static void inputGame() {
        game = Integer.parseInt(scanner.nextLine());
    }

    public static String getName() {
        return name;
    }

    public static int getGame() {
        return game;
    }

    public static void inputAnswer() {
        answer = scanner.nextLine();
    }

    public static String getAnswer() {
        return answer;
    }
}
