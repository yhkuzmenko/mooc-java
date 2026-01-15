
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int end = Integer.valueOf(scanner.nextLine());
        int factorial = 0;
        for (int i = 0; i <= end; i++) {
            if (i == 0) {
                factorial = 1;
            } else {
                factorial *= i;
            }
        }
        System.out.println("Factorial " + factorial);
    }
}
