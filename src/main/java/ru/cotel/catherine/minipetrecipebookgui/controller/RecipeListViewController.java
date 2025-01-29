package ru.cotel.catherine.minipetrecipebookgui.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ru.cotel.catherine.minipetrecipebookgui.ChangeWindowInterface;
import ru.cotel.catherine.minipetrecipebookgui.HelloApplication;
import ru.cotel.catherine.minipetrecipebookgui.recipeList.RecipeList;

import java.io.IOException;

public class RecipeListViewController implements ChangeWindowInterface {
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

    SetAndGetSomeText textForLabel = new SetAndGetSomeText();
    RecipeList recipeList = new RecipeList();
    private Parent root;
    private Stage stage = new Stage();

    @FXML
    public ListView<String> list;

    @FXML
    void initialize() {
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.addAll(recipeList.getRecipeKey());
        list.getItems().addAll(observableList);
        setCurrentRecipe();
    }

    @FXML
    public void handleMouseClicked(MouseEvent mouseEvent) {
        list.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("recipe.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        root = loader.getRoot();
        stage.setScene(new Scene(root));
        stage.show();
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

    private void setCurrentRecipe() {
        MultipleSelectionModel<String> langsSelectionModel = list.getSelectionModel();
        // устанавливаем слушатель для отслеживания изменений

        langsSelectionModel.selectedItemProperty().addListener((changed, oldValue, newValue) -> {
            textForLabel.setSomeText(newValue);
        });
    }


}
