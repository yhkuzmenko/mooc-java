import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            System.out.println();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    if (amount < 0) {
                        break;
                    }

                    first += amount;

                    if (first > 100) {
                        first = 100;
                    }

                    break;

                case "move":
                    if (amount < 0) {
                        break;
                    }

                    if (amount > first) {
                        amount = first;
                    }

                    first = first - amount;
                    second = second + amount;

                    if (second > 100) {
                        second = 100;
                    }

                    break;

                case "remove":
                    if (amount < 0) {
                        break;
                    }

                    second = second - amount;

                    if (second < 0) {
                        second = 0;
                    }

                    break;

                default:
                    break;
            }
        }

        scan.close();
    }

}