package org.fundacionjala.at04.teamtetris.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abelb on 6/25/2017.
 */
public class STetromino implements TetrominoModel {

    private final List<int[][]> tetrominoShape = new ArrayList<>();

    public STetromino() {
        tetrominoShape.add(new int[][]{
                {0, 0, 0, 0},
                {0, 0, 1, 1},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        });
        tetrominoShape.add(new int[][]{
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0}
        });
    }

    @Override
    public List<int[][]> getTetromino() {
        return tetrominoShape;
    }
}
