package org.fundacionjala.at04.teamtetris.views;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

/**
 * Created by abelb on 6/24/2017.
 */
public class GameScreenView extends BorderPane{

    public GameScreenView() {
        setPrefSize(500, 500);

        VBox leftPane = new VBox(200);
        leftPane.setMinWidth(120);
        leftPane.setMinHeight(500);
        Background borders = new Background(new BackgroundFill(Color.web("#44c3f4"), CornerRadii.EMPTY, Insets.EMPTY));
        leftPane.setBackground(borders);
        leftPane.getChildren().add(new PanelView("Hold"));
        leftPane.getChildren().add(new PanelView("Level"));
        setLeft(leftPane);

        VBox rightPane = new VBox(200);
        rightPane.setMinWidth(120);
        rightPane.setMinHeight(500);
        rightPane.setBackground(borders);
        rightPane.getChildren().add(new PanelView("Next"));
        rightPane.getChildren().add(new PanelView("Lines Sent"));
        setRight(rightPane);

        BoardViewImpl boardView = new BoardViewImpl(25);
        setCenter(boardView);
        setMargin(boardView, new Insets(5, 5, 5, 5));
    }
}
