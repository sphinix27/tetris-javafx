package org.fundacionjala.at04.teamtetris.controllers.eventhandlers;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Created by abelb on 6/24/2017.
 */
public class ExitEventHandler implements EventHandler<WindowEvent> {
    private Stage stage;

    public ExitEventHandler(final Stage stage) {
        this.stage = stage;
    }

    @Override
    public void handle(WindowEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Warning");
        alert.setHeaderText("Close Application");
        alert.setContentText("Are you sure want to quit Tetris?");
        alert.showAndWait()
                .filter(response -> response == ButtonType.CANCEL)
                .ifPresent(response -> event.consume());
    }
}
