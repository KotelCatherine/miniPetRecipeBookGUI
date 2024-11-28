package ru.cotel.catherine.minipetrecipebookgui.yumYumBook;

import ru.cotel.catherine.minipetrecipebookgui.cookingProcess.CookingProcess;
import ru.cotel.catherine.minipetrecipebookgui.ingredients.Ingredients;
import ru.cotel.catherine.minipetrecipebookgui.kitchenTypeEnum.KitchenType;

import java.util.Map;

public abstract class YumYumBook {
    Ingredients ingredients = new Ingredients();
    CookingProcess cookingMethod = new CookingProcess();
    private KitchenType kitchenType;
    private String dishCategory;

    public YumYumBook(KitchenType kitchenType, String dishCategory) {
        this.kitchenType = kitchenType;
        this.dishCategory = dishCategory;
    }

    public void print(String recipeTitle, Map<String, String> ingredientsRecipe) {
        ingredients.printIngredients(recipeTitle, ingredientsRecipe);
        cookingMethod();
    }

    public void cookingMethod() {
        cookingMethod.cookRecipe(this.getClassName());
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }


}
