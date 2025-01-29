package ru.cotel.catherine.minipetrecipebookgui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public interface ChangeWindowInterface {
    default void changeWindow(Button button, String title) {
        button.setOnAction(event -> {
            button.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(title));

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
