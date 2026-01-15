
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statsOfAll = new Statistics();
        Statistics statsOfEven = new Statistics();
        Statistics statsOfOdd = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            statsOfAll.addNumber(number);

            if (number % 2 == 0) {
                statsOfEven.addNumber(number);
            } else {
                statsOfOdd.addNumber(number);
            }
        }

        System.out.println("Sum: " + statsOfAll.sum());
        System.out.println("Sum of even numbers: " + statsOfEven.sum());
        System.out.println("Sum of odd numbers: " + statsOfOdd.sum());
    }
}
