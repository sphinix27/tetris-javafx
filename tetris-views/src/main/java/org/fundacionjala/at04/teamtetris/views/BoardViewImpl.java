package org.fundacionjala.at04.teamtetris.views;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import org.fundacionjala.at04.teamtetris.models.BoardModel;
import org.fundacionjala.at04.teamtetris.models.BoardModelImpl;

/**
 * Created by abelb on 6/25/2017.
 */
public class BoardViewImpl extends Pane implements BoardView {

    private static final Color LINE_COLOR = Color.web("#44c3f4");
    public static final int ROWS = 20;
    public static final int COLUMNS = 10;
    private int squareSize;
    private int width;
    private int height;
    private BoardModel boardModel;
    private Rectangle[][] boardView;

    public BoardViewImpl(int squareSize) {
        this.squareSize = squareSize;
        this.width = squareSize * COLUMNS;
        this.height = squareSize * ROWS;
        setMinWidth(width);
        setMaxHeight(height);
        setPadding(new Insets(10, 10, 10, 10));
        setBorder(new Border(new BorderStroke(LINE_COLOR, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        boardModel = new BoardModelImpl(ROWS, COLUMNS);
        boardView = new Rectangle[ROWS][COLUMNS];
        drawBoard();
    }

    @Override
    public void drawBoard() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                boardView[i][j] = new Rectangle(squareSize, squareSize);
                boardView[i][j].setStroke(LINE_COLOR);
                boardView[i][j].setFill(Color.WHITE);
                int x = width / COLUMNS * j;
                boardView[i][j].setTranslateX(x);
                int y = height / ROWS * i;
                boardView[i][j].setTranslateY(y);
                getChildren().add(boardView[i][j]);
            }
        }

        //Demo de figura I
        boardView[19][9].setFill(Color.CYAN);
        boardView[18][9].setFill(Color.CYAN);
        boardView[17][9].setFill(Color.CYAN);
        boardView[16][9].setFill(Color.CYAN);

        //Demo de figura J
        boardView[19][7].setFill(Color.BLUE);
        boardView[19][8].setFill(Color.BLUE);
        boardView[18][8].setFill(Color.BLUE);
        boardView[17][8].setFill(Color.BLUE);

        //Demo de figura L
        boardView[19][6].setFill(Color.ORANGE);
        boardView[19][5].setFill(Color.ORANGE);
        boardView[18][5].setFill(Color.ORANGE);
        boardView[17][5].setFill(Color.ORANGE);

        //Demo de figura O
        boardView[18][6].setFill(Color.YELLOW);
        boardView[18][7].setFill(Color.YELLOW);
        boardView[17][6].setFill(Color.YELLOW);
        boardView[17][7].setFill(Color.YELLOW);

        //Demo de figura S
        boardView[15][9].setFill(Color.GREEN);
        boardView[15][8].setFill(Color.GREEN);
        boardView[16][8].setFill(Color.GREEN);
        boardView[16][7].setFill(Color.GREEN);

        //Demo de figura T
        boardView[19][4].setFill(Color.PURPLE);
        boardView[19][3].setFill(Color.PURPLE);
        boardView[18][3].setFill(Color.PURPLE);
        boardView[19][2].setFill(Color.PURPLE);

        //Demo de figura Z
        boardView[0][2].setFill(Color.RED);
        boardView[0][3].setFill(Color.RED);
        boardView[1][3].setFill(Color.RED);
        boardView[1][4].setFill(Color.RED);
    }
}
