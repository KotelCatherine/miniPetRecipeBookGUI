package ru.cotel.catherine.minipetrecipebookgui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import ru.cotel.catherine.minipetrecipebookgui.ChangeWindowInterface;

public class HeadViewController implements ChangeWindowInterface {
    @FXML
    public Button buttonRecipeList;
    @FXML
    public Button buttonWeeklyMenu;
    @FXML
    public Button buttonFavorites;
    @FXML
    public Button buttonThems;
    @FXML
    public Button buttonAddNewRecipe;
    @FXML
    public Pane pane;

    @FXML
    void initialize() {
        onButtonRecipeListClick();
        onButtonThemsClick();
    }

    @FXML
    public void onButtonThemsClick() {
        changeWindow(buttonThems, "thems-view.fxml");
    }

    @FXML
    public void onButtonFavoritesClick() {
    }

    @FXML
    public void onButtonWeeklyMenuClick() {
    }


    @FXML
    public void onButtonRecipeListClick() {
        changeWindow(buttonRecipeList, "recipe-list-view.fxml");
    }

    public void onButtonAddNewRecipe(ActionEvent actionEvent) {
    }


}
