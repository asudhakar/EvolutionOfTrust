package com.bootcamp;

public class Player {
    private PlayerBehaviour behaviour;

    public Player(PlayerBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    Move play() {
        return this.behaviour.play();
    }

    public void changeBehaviour(PlayerBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public PlayerBehaviour getBehaviour() {
        return behaviour;
    }
}
