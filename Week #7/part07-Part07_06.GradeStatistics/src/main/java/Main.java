import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointsRegister register = new PointsRegister();

        UserInterface ui = new UserInterface(scanner, register);
        ui.start();
    }
}