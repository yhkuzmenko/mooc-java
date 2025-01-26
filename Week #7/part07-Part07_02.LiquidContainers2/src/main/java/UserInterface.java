import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container first;
    private Container second;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.first = new Container();
        this.second = new Container();
    }

    public void start() {
        while (true) {
            printWaterLevels();

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            chooseCommand(command, amount);
        }
    }

    public void chooseCommand(String command, int amount) {
        switch (command) {
            case "add":
                add(amount);
                break;

            case "move":
                move(amount);
                break;

            case "remove":
                remove(amount);
                break;

            default:
                break;
        }
    }

    public void add(int amount) {
        first.add(amount);
    }

    public void move(int amount) {
        if (amount > first.contains()) {
            amount = first.contains();
        }

        first.remove(amount);
        second.add(amount);
    }

    public void remove(int amount) {
        second.remove(amount);
    }

    public void printWaterLevels() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}