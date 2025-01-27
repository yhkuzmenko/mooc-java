import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdsRegister register = new BirdsRegister();
        UserInterface ui = new UserInterface(scan, register);
        ui.start();
    }

}