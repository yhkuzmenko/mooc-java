import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipesDatabase db;

    public UserInterface(Scanner scanner, RecipesDatabase db) {
        this.scanner = scanner;
        this.db = db;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        db.readFile(file);

        while (true) {
            System.out.println();
            printCommands();
            System.out.println();
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            chooseCommand(input);
        }
    }

    private void chooseCommand(String command) {
        switch (command) {
            case "list":
                list();
                break;

            case "find name":
                findByName();
                break;

            case "find cooking time":
                findByCookingTime();
                break;

            case "find ingredient":
                findByIngredient();
                break;

            default:
                break;
        }
    }

    private void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    private void list() {
        db.listRecipes();
    }

    private void findByName() {
        System.out.print("Searched word: ");
        String search = scanner.nextLine();
        db.findByName(search);
    }

    private void findByCookingTime() {
        System.out.print("Max cooking time: ");
        int search = Integer.valueOf(scanner.nextLine());
        db.findByCookingTime(search);
    }

    private void findByIngredient() {
        System.out.print("Ingredient: ");
        String search = scanner.nextLine();
        db.findByIngredient(search);
    }
}