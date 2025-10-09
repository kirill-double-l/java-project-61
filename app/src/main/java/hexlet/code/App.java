package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        Cli.inputGame();
        System.out.println("Your choice: " + Cli.getGame());

        switch (Cli.getGame()) {
            case 1:
                GreetGame.sayHello();
                break;
            case 2:
                EvenGame.startGame();
                break;
            case 0:
                break;
        }
    }
}
