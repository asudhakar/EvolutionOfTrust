package com.bootcamp;

public abstract class PlayerBehaviour {
    protected CurrentRoundInfo currentRoundInfo;

    public PlayerBehaviour(CurrentRoundInfo currentRoundInfo) {
        this.currentRoundInfo = currentRoundInfo;
    }

    public CurrentRoundInfo getCurrentRoundInfo() {
        return currentRoundInfo;
    }
    abstract Behaviour play();
}
