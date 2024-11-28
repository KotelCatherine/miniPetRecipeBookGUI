package ru.cotel.catherine.minipetrecipebookgui.ingredients;

import java.util.Map;

public class Ingredients {
    public void printIngredients(String recipeTitle, Map<String, String> ingredients) {
        System.out.println("-----------------");
        System.out.println(recipeTitle + "\n Ingredients:\n");
        ingredients.forEach((key, value) -> System.out.println(key + " - " + value));
        System.out.println("-----------------\n");
    }
}
