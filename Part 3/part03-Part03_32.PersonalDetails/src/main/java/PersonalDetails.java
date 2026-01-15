
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0, sum = 0, longest = 0;
        String longestName = "";

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            count++;

            String[] words = text.split(",");
            int age = Integer.valueOf(words[1]);
            sum += age;

            String name = words[0];
            if (name.length() > longest) {
                longest = name.length();
                longestName = words[0];
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum / count);
    }
}
