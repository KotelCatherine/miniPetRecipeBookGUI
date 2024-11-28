package ru.cotel.catherine.minipetrecipebookgui.controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import ru.cotel.catherine.minipetrecipebookgui.HelloApplication;

import java.io.IOException;

public class HeadViewController {
    @FXML
    public Button buttonRecipeList;
    @FXML
    public Button buttonWeeklyMenu;
    @FXML
    public Button buttonSearchRecipe;
    @FXML
    public Button buttonFavorites;
    @FXML
    public Button buttonThems;

    @FXML
    void initialize() {
        onButtonRecipeListClick();
        onButtonThemsClick();
    }

    @FXML
    public void onButtonThemsClick() {
        buttonThems.setOnAction(event -> {
            buttonThems.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(""));

            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }

    @FXML
    public void onButtonFavoritesClick() {
    }

    @FXML
    public void onButtonSearchRecipeClick() {
    }

    @FXML
    public void onButtonWeeklyMenuClick() {
    }


    @FXML
    public void onButtonRecipeListClick() {
        buttonRecipeList.setOnAction(event -> {
            buttonRecipeList.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("recipe-list-view.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}
