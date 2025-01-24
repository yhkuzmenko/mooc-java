import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            chooseCommand(input);
        }
    }

    public void chooseCommand(String input) {
        switch (input) {
            case "add":
                add();
                break;

            case "list":
                list();
                break;

            case "remove":
                remove();
                break;

            default:
                break;
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        todo.add(task);
    }

    public void list() {
        todo.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(scanner.nextLine());
        todo.remove(index);
    }
}