module ru.cotel.catherine.minipetrecipebookgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens ru.cotel.catherine.minipetrecipebookgui to javafx.fxml;
    exports ru.cotel.catherine.minipetrecipebookgui;
    exports ru.cotel.catherine.minipetrecipebookgui.cookingProcess;
    opens ru.cotel.catherine.minipetrecipebookgui.cookingProcess to javafx.fxml;
    exports ru.cotel.catherine.minipetrecipebookgui.controller;
    opens ru.cotel.catherine.minipetrecipebookgui.controller to javafx.fxml;
    exports ru.cotel.catherine.minipetrecipebookgui.ingredients;
    opens ru.cotel.catherine.minipetrecipebookgui.ingredients to javafx.fxml;
    exports ru.cotel.catherine.minipetrecipebookgui.kitchenTypeEnum;
    opens ru.cotel.catherine.minipetrecipebookgui.kitchenTypeEnum to javafx.fxml;
    exports ru.cotel.catherine.minipetrecipebookgui.yumYumBook;
    opens ru.cotel.catherine.minipetrecipebookgui.yumYumBook to javafx.fxml;
    exports ru.cotel.catherine.minipetrecipebookgui.recipeList;
    opens ru.cotel.catherine.minipetrecipebookgui.recipeList to javafx.fxml;
}