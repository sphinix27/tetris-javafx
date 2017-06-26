package org.fundacionjala.at04.teamtetris.models;

/**
 * Created by abelb on 6/25/2017.
 */
public class BoardModelImpl implements BoardModel {

    private final int rows;
    private final int columns;
    private int[][] boardGame;

    public BoardModelImpl(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        boardGame = new int[rows][columns];
    }

    @Override
    public int[][] getBoard() {
        return boardGame;
    }
}
