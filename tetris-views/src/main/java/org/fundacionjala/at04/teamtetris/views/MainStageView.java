package org.fundacionjala.at04.teamtetris.views;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by abelb on 6/24/2017.
 */
public class MainStageView implements StageView {
    private Stage mainStage;
    private HBox root;

    public MainStageView(Stage stage) {
        this.mainStage = stage;
        root = new HBox(4);
        root.setStyle("-fx-background: #328ce7;");
        root.getChildren().add(new NewGameView(250, 500));
        root.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(root, 1000, 500));
        stage.setResizable(false);
        stage.show();
    }

    public void setTitle(String title) {
        this.mainStage.setTitle(title);
    }

    @Override
    public Stage getMainView() {
        return this.mainStage;
    }

    @Override
    public HBox getRoot() {
        return this.root;
    }
}
