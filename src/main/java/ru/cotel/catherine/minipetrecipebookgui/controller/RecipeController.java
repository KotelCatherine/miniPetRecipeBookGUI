package ru.cotel.catherine.minipetrecipebookgui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import ru.cotel.catherine.minipetrecipebookgui.ChangeWindowInterface;
import ru.cotel.catherine.minipetrecipebookgui.recipeList.RecipeList;

public class RecipeController implements ChangeWindowInterface {

    @FXML
    public Button buttonRecipeList;

    @FXML
    public Button buttonThems;

    @FXML
    public Button buttonFavorites;

    @FXML
    public Button buttonWeeklyMenu;

    @FXML
    public Button buttonAddNewRecipe;

    @FXML
    public TextFlow textPane;

    @FXML
    public Label recipeName;

    private SetAndGetSomeText textForLabel = new SetAndGetSomeText();
    private RecipeList recipeList = new RecipeList();

    @FXML
    void initialize() {
        String title = textForLabel.getSomeText();
        recipeName.setText(title);
        Text text = new Text(recipeList.getTextFromFile(title));
        textPane.getChildren().add(text);
    }

    @FXML
    void onButtonAddNewRecipe(ActionEvent event) {
        changeWindow(buttonRecipeList, "add-new-recipe.fxml");
    }

    @FXML
    void onButtonFavoritesClick(ActionEvent event) {
        changeWindow(buttonFavorites, "favorites-view.fxml");
    }

    @FXML
    void onButtonRecipeListClick(ActionEvent event) {
        changeWindow(buttonRecipeList, "recipe-list-view.fxml");
    }


    @FXML
    void onButtonThemsClick(ActionEvent event) {
        changeWindow(buttonThems, "themes-view.fxml");
    }

    @FXML
    void onButtonWeeklyMenuClick(ActionEvent event) {
        changeWindow(buttonWeeklyMenu, "weekly-menu.fxml");
    }
}
