package ru.cotel.catherine.minipetrecipebookgui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import ru.cotel.catherine.minipetrecipebookgui.HelloApplication;
import ru.cotel.catherine.minipetrecipebookgui.recipeList.RecipeList;

import java.io.IOException;

public class RecipeController {
    public Button buttonMainMenu;
    private SetAndGetSomeText textForLabel = new SetAndGetSomeText();
    private RecipeList recipeList = new RecipeList();
    private Parent root;
    private Stage stage = new Stage();
    @FXML
    public TextFlow textPane;

    @FXML
    public Button buttonBack;

    @FXML
    public Label recipeName;

    @FXML
    void initialize() {
        String title = textForLabel.getSomeText();
        recipeName.setText(title);
        Text text = new Text(recipeList.getTextFromFile(title));
        textPane.getChildren().add(text);
    }

    public void onButtonBackClick(ActionEvent event) {
        buttonBack.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("recipe-list-view.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        root = loader.getRoot();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void onButtonMainMenuClick(ActionEvent event) {
    }
}
