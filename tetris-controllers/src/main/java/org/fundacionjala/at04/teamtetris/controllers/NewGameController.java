package org.fundacionjala.at04.teamtetris.controllers;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import org.fundacionjala.at04.teamtetris.controllers.eventhandlers.NewGameEventHandler;
import org.fundacionjala.at04.teamtetris.views.NewGameMainView;

/**
 * Created by abelb on 6/25/2017.
 */
public class NewGameController {

    private NewGameMainView view;
    private HBox root;

    public NewGameController(NewGameMainView view, HBox root) {
        this.view = view;
        this.root = root;
        setupEventHandlers();
    }

    private void setupEventHandlers() {
        Button newGameButton = view.getNewGameButton();
        newGameButton.setOnAction(new NewGameEventHandler(newGameButton, root));
    }
}
