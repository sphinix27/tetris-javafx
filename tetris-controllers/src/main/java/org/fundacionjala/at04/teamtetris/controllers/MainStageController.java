package org.fundacionjala.at04.teamtetris.controllers;

import javafx.stage.Stage;
import org.fundacionjala.at04.teamtetris.controllers.eventhandlers.ExitEventHandler;
import org.fundacionjala.at04.teamtetris.models.StageModel;
import org.fundacionjala.at04.teamtetris.views.StageView;

/**
 * Created by abelb on 6/24/2017.
 */
public class MainStageController {

    public StageView view;
    public StageModel model;

    public MainStageController(StageView view, StageModel model) {
        this.view = view;
        this.model = model;
        setupEventHandlers();
        setStageTitle();
    }

    private void setStageTitle() {
        view.getMainView().setTitle(model.getTitle());
    }

    private void setupEventHandlers() {
        Stage stage = view.getMainView();
        stage.setOnCloseRequest(new ExitEventHandler(stage));
    }
}
