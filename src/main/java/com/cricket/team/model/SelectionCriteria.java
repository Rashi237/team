package com.cricket.team.model;

public class SelectionCriteria {
    private float playerHeight;
    private float playerBmi;
    private float playerRuns;
    private float playerWickets;
    private float playerStumpings;

    public float getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(float playerHeight) {
        this.playerHeight = playerHeight;
    }

    public float getPlayerBmi() {
        return playerBmi;
    }

    public void setPlayerBmi(float playerBmi) {
        this.playerBmi = playerBmi;
    }

    public float getPlayerRuns() {
        return playerRuns;
    }

    public void setPlayerRuns(float playerRuns) {
        this.playerRuns = playerRuns;
    }

    public float getPlayerWickets() {
        return playerWickets;
    }

    public void setPlayerWickets(float playerWickets) {
        this.playerWickets = playerWickets;
    }

    public float getPlayerStumpings() {
        return playerStumpings;
    }

    public void setPlayerStumpings(float playerStumpings) {
        this.playerStumpings = playerStumpings;
    }

    @Override
    public String toString() {
        return "SelectionCriteria{" +
                "playerHeight=" + playerHeight +
                ", playerBmi=" + playerBmi +
                ", playerRuns=" + playerRuns +
                ", playerWickets=" + playerWickets +
                ", playerStumpings=" + playerStumpings +
                '}';
    }
}
