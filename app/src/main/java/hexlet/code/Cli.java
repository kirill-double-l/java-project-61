package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;
    private static int game;

    public static void inputName() {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }

    public static void inputGame() {
        Scanner scanner = new Scanner(System.in);
        game = Integer.parseInt(scanner.nextLine());
    }

    public static String getName() {
        return name;
    }

    public static int getGame() {
        return game;
    }
}
