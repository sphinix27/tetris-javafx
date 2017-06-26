package org.fundacionjala.at04.teamtetris.views;

import javafx.scene.control.TitledPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by abelb on 6/25/2017.
 */
public class PanelView extends TitledPane {

    private String title;

    public PanelView(String title) {
        this.title = title;
        setText(title);
        setContent(new Rectangle(125,125, Color.WHITE));
        setWidth(125);
        setHeight(125);
    }
}
