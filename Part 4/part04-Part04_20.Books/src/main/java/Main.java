import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.println("");

        System.out.print("What information will be printed?: ");
        String infoToPrint = scanner.nextLine();

        for (Book book : books) {
            if (infoToPrint.equals("everything")) {
                System.out.println(book);
            }

            if (infoToPrint.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}