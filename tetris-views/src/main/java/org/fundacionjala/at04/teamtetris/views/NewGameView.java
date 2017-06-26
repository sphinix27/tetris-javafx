package org.fundacionjala.at04.teamtetris.views;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

/**
 * Created by abelb on 6/25/2017.
 */
public class NewGameView extends HBox implements NewGameMainView{

    private int width;
    private int height;
    private Button newGameButton;
    private Button newBattleGameButton;
    private static final Color LINE_COLOR = Color.web("#44c3f4");

    public NewGameView(int width, int height) {
        this.width = width;
        this.height = height;
        setMinWidth(width);
        setMaxHeight(height);
        setBorder(new Border(new BorderStroke(LINE_COLOR, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        newGameButton = new Button("New Game");
        getChildren().add(newGameButton);
        setAlignment(Pos.CENTER);
    }

    @Override
    public Button getNewGameButton() {
        return this.newGameButton;
    }
}
