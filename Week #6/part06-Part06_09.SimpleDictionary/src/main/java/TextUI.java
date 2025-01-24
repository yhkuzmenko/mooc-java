import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                end();
                break;
            }

            chooseCommand(input);
        }
    }

    private void chooseCommand(String command) {
        switch (command) {
            case "add":
                add();
                break;

            case "search":
                search();
                break;

            default:
                System.out.println("Unknown command");
                break;
        }
    }

    private void end() {
        System.out.println("Bye bye!");
    }

    private void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        dictionary.add(word, translation);
    }

    private void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();

        if (dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
            return;
        }
        
        System.out.println("Translation: " + dictionary.translate(word));
    }
}