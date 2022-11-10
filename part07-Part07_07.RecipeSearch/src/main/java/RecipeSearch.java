import java.util.Scanner;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recipes recipes = new Recipes();

        //recipes.readRecipes();

        ArrayList<String> info = new ArrayList<>();

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.equals("")) {
                    recipes.add(new Recipe(info));
                    info.clear();
                    continue;
                }
                info.add(line);
            }
            recipes.add(new Recipe(info));
        } catch(Exception e) {
            System.out.println("Error" + e);
        }


        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while(true) {
            System.out.println("Enter command: ");
            String cmd = scanner.nextLine();

            if(cmd.equals("stop")) {
                break;
            } else if(cmd.equals("list")) {
                recipes.list();
            } else if(cmd.equals("find name")) {
                System.out.println("Searched word: ");
                String input = scanner.nextLine();
                recipes.find(input);
            } else if(cmd.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int input = Integer.valueOf(scanner.nextLine());
                recipes.cookingTime(input);
            } else if(cmd.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String input = scanner.nextLine();
                recipes.searchIngredient(input);
            } else {
                System.out.println("Error!");
                break;
            }


        }
    }

}
