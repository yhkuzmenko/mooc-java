import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private BirdsRegister register;

    public UserInterface(Scanner scan, BirdsRegister register) {
        this.scan = scan;
        this.register = register;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();

            if (input.equals("Quit")) {
                break;
            }

            chooseCommand(input);
        }
    }

    public void chooseCommand(String command) {
        switch (command) {
            case "Add":
                add();
                break;
            case "Observation":
                observation();
                break;
            case "All":
                all();
                break;
            case "One":
                one();
                break;

            default:
                break;
        }
    }

    public void add() {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String nameInLatin = scan.nextLine();
        register.add(new Bird(name, nameInLatin));
    }

    public void observation() {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        register.observe(name);
    }

    public void all() {
        register.printAllBirds();
    }

    public void one() {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        register.printBird(name);
    }
}