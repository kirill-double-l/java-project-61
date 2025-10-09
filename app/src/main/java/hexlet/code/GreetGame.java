package hexlet.code;

public class GreetGame {

    public static void sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Cli.inputName();
        System.out.println("Hello, " + Cli.getName() + "!");
    }
}
