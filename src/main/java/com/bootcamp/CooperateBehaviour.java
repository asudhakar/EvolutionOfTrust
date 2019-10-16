package com.bootcamp;

public class CooperateBehaviour extends PlayerBehaviour {

    public CooperateBehaviour(CurrentRoundInfo currentRoundInfo) {
        super(currentRoundInfo);
    }

    @Override
    public Behaviour play() {
        return Behaviour.Cooperate;
    }
}
