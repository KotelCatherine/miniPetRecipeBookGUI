package ru.cotel.catherine.minipetrecipebookgui.cookingProcess;

import java.io.*;

public class CookingProcess {
    public void cookRecipe(String titleRecipe){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(titleRecipe+".txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            System.out.println("Метод приготовления не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}