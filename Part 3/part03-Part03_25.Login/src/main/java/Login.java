
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctMessage = "You have successfully logged in!";
        String incorrectMessage = "Incorrect username or password!";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("alex") && password.equals("sunshine")) {
            System.out.println(correctMessage);
            return;
        }

        if (username.equals("emma") && password.equals("haskell")) {
            System.out.println(correctMessage);
            return;
        }

        System.out.println(incorrectMessage);
    }
}
