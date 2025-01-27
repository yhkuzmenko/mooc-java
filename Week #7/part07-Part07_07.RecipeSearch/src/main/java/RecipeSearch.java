import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipesDatabase db = new RecipesDatabase();
        UserInterface ui = new UserInterface(scanner, db);

        ui.start();
    }

}