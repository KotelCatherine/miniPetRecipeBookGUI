package ru.cotel.catherine.minipetrecipebookgui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import ru.cotel.catherine.minipetrecipebookgui.ChangeWindowInterface;

public class AddNewRecipe implements ChangeWindowInterface {

    @FXML
    private Button buttonAddNewRecipe;

    @FXML
    private Button buttonFavorites;

    @FXML
    private Button buttonRecipeList;

    @FXML
    private Button buttonThems;

    @FXML
    private Button buttonWeeklyMenu;

    @FXML
    private TextArea ingridients;

    @FXML
    private TextArea instruction;

    @FXML
    private Pane paneMenu;

    @FXML
    private TextField titleRecipe;

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

    @FXML
    void initialize() {

    }

}

