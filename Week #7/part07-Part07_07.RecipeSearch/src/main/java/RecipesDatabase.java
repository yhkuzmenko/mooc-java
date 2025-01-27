import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipesDatabase {
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public void readFile(String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.parseInt(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine().trim();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void findByName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void findByCookingTime(int cookingTime) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findByIngredient(String ingredient) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}