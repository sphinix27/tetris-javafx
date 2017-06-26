package org.fundacionjala.at04.teamtetris.controllers.eventhandlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import org.fundacionjala.at04.teamtetris.views.GameScreenView;

/**
 * Created by abelb on 6/25/2017.
 */
public class NewGameEventHandler implements EventHandler<ActionEvent> {
    private Button newGameButton;
    private HBox root;

    public NewGameEventHandler(final Button button, HBox root) {
        this.newGameButton = button;
        this.root = root;
    }

    @Override
    public void handle(ActionEvent event) {
        root.getChildren().clear();
        root.getChildren().add(new GameScreenView());
        root.getChildren().add(new GameScreenView());
    }
}
