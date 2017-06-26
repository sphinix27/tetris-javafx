package org.fundacionjala.at04.teamtetris.app;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.fundacionjala.at04.teamtetris.controllers.MainStageController;
import org.fundacionjala.at04.teamtetris.controllers.NewGameController;
import org.fundacionjala.at04.teamtetris.views.MainStageView;
import org.fundacionjala.at04.teamtetris.models.StageModel;
import org.fundacionjala.at04.teamtetris.models.StageModelImpl;
import org.fundacionjala.at04.teamtetris.views.NewGameView;
import org.fundacionjala.at04.teamtetris.views.StageView;

/**
 * Created by abelb on 6/24/2017.
 */
public class TetrisMain extends Application {

    public static void main(String[] args) {
        launch(args);;
    }

    @Override
    public void start(Stage primatyStage) throws Exception {
        StageView mainStageView = new MainStageView(primatyStage);
        StageModel mainStageModel = new StageModelImpl("Tetris");
        MainStageController mainStageController = new MainStageController(mainStageView, mainStageModel);
        NewGameController newGameController = new NewGameController((NewGameView) mainStageView.getRoot().getChildren().get(0), mainStageView.getRoot());
    }
}
