import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private PointsRegister register;

    public UserInterface(Scanner scanner, PointsRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        readInput();
        printAverages();
        printAveragesOfPassing();
        printPassPercentage();
        printGradeDistribution();
    }

    public void readInput() {
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            register.add(input);
        }
    }

    public void printAverages() {
        System.out.println("Point average (all): " + register.average());
    }

    public void printAveragesOfPassing() {
        if (register.averagePassing() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + register.averagePassing());
        }
    }

    public void printPassPercentage() {
        System.out.println("Pass percentage: " + register.passPercentage());
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();
            grade--;
        }
    }

    public void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}