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
import ru.cotel.catherine.minipetrecipebookgui.HelloApplication;
import ru.cotel.catherine.minipetrecipebookgui.recipeList.RecipeList;

import java.io.IOException;

public class RecipeListViewController {
    SetAndGetSomeText textForLabel = new SetAndGetSomeText();
    RecipeList recipeList = new RecipeList();
    private Parent root;
    private Stage stage = new Stage();
    @FXML
    public Button buttonBack;

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

    private void setCurrentRecipe() {
        MultipleSelectionModel<String> langsSelectionModel = list.getSelectionModel();
        // устанавливаем слушатель для отслеживания изменений

        langsSelectionModel.selectedItemProperty().addListener((changed, oldValue, newValue) -> {
            textForLabel.setSomeText(newValue);
        });
    }

    public void onButtonBackClick(ActionEvent event) {
        buttonBack.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("head-view.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        root = loader.getRoot();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
