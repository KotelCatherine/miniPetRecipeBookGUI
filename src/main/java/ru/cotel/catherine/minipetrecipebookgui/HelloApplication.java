package ru.cotel.catherine.minipetrecipebookgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ru.cotel.catherine.minipetrecipebookgui.kitchenTypeEnum.KitchenType;
import ru.cotel.catherine.minipetrecipebookgui.recipeList.RecipeList;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("head-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        stage.setTitle("CookBook");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}