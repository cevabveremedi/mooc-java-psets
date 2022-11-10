
//import java.io.File;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Scanner;
import java.util.ArrayList;

public class Recipes {
    ArrayList<Recipe> recipes;
    
    public Recipes() {
        recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        recipes.add(recipe);
    }

    /*
    public void readRecipes() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> info = new ArrayList<>();

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.equals("\n")) {
                    this.recipes.add(new Recipe(info));
                    info.clear();
                    continue;
                }
                info.add(line);
            }
        } catch(Exception e) {
            System.out.println("Error" + e);
        }
    }
    */

    public void list() {
        for(Recipe recipe: recipes)
            System.out.println(recipe);
    }

    public void find(String name) {
        for(Recipe recipe: recipes) {
            if(recipe.getName().contains(name))
                System.out.println(recipe);
        }
    }

    public void cookingTime(int time) {
        for(Recipe recipe: recipes) {
            if(recipe.getTime() <= time)
                System.out.println(recipe);
        }
    }

    public void searchIngredient(String name) {
        for(Recipe recipe: recipes) {
            if(recipe.checkIngredients(name))
                System.out.println(recipe);
        }
    }
}
