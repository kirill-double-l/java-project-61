package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;

    public static void inputName() {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }

    public static String getName() {
        return name;
    }
}
