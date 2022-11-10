import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(ArrayList<String> info) {
        this.name = info.get(0);
        this.time = Integer.valueOf(info.get(1));
        info.remove(0);
        info.remove(0);
        this.ingredients = new ArrayList<>(info);
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public Boolean checkIngredients(String name) {
        for(String ingredient: ingredients) {
            if(ingredient.equals(name))
                return true;
            System.out.println(ingredient);
        }
        return false;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
