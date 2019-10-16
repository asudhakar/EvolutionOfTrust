package com.bootcamp;

public class Player {
    private PlayerBehaviour behaviour;

    public Player(PlayerBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    Behaviour play() {
        Behaviour  behaviour = this.behaviour.play();
        CurrentRoundInfo currentRoundInfo = this.behaviour.currentRoundInfo;
        currentRoundInfo.behaviour =  behaviour;
        return behaviour;
    }
}
