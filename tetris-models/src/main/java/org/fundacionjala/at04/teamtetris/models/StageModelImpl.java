package org.fundacionjala.at04.teamtetris.models;

/**
 * Created by abelb on 6/24/2017.
 */
public class StageModelImpl implements StageModel {
    private String title;

    public StageModelImpl(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
