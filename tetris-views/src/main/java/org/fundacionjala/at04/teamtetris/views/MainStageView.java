package org.fundacionjala.at04.teamtetris.views;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by abelb on 6/24/2017.
 */
public class MainStageView implements StageView {
    private Stage mainStage;

    public MainStageView(Stage stage) {
        this.mainStage = stage;
        Image background = new Image("File:tetris-views/src/main/resources/background.png");
        VBox root = new VBox();
        root.getChildren().add(new ImageView(background));
        stage.setScene(new Scene(root, 1000, 700));
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
}
