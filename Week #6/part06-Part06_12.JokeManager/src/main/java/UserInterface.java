import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printCommands();
            
            String input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            }

            chooseCommand(input);
        }
    }

    private void chooseCommand(String input) {
        switch (input) {
            case "1":
                add();
                break;
            case "2":
                draw();
                break;
            case "3":
                print();
                break;

            default:
                break;
        }
    }

    private void printCommands() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

    private void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokes.addJoke(joke);
    }

    private void draw() {
        System.out.println("Drawing a joke.");
        System.out.println(jokes.drawJoke());
    }

    private void print() {
        System.out.println("Printing the jokes.");
        jokes.printJokes();
    }
}