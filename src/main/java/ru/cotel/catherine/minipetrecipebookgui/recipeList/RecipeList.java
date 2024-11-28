package ru.cotel.catherine.minipetrecipebookgui.recipeList;

import java.io.*;
import java.util.*;

public class RecipeList {
    private Map<String, File> recipe = new TreeMap<>();
    private String nameRecipe;
    private File recipeFile;

    public RecipeList(){
        File file = new File("Okroshka.txt");
        File file1 = new File("WienerBackhendl.txt");
        addRecipe("Окрошка", file);
        addRecipe("Бакхендль", file1);
    }

    public void addRecipe(String nameRecipe, File recipeFile){
        recipe.put(nameRecipe, recipeFile);
    }

    public Map<String, File> getRecipe() {
        return recipe;
    }

    public String getTextFromFile(String key){
        String fileName = getRecipeFile(key);
        String textFromFile = "";
        try(
            BufferedReader buffered = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = buffered.readLine()) != null){
                textFromFile += line;
            }
        return textFromFile;
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e){

        }
        return "";
    }

    public String getRecipeFile(String key) {
        System.out.println(recipe.get(key).toString());
        return recipe.get(key).toString();
    }

    public List<String> getRecipeKey() {
        List<String> recipeNames = new ArrayList<>();
        for (Map.Entry<String, File> map: recipe.entrySet()){
            recipeNames.add(map.getKey());
        }
        return recipeNames;
    }

    @Override
    public String toString() {
        return "RecipeList{" +
                "recipe=" + recipe +
                '}';
    }
}
