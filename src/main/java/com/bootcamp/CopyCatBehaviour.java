package com.bootcamp;

public class CopyCatBehaviour extends PlayerBehaviour {

    public CopyCatBehaviour(CurrentRoundInfo currentRoundInfo) {
        super(currentRoundInfo);
    }

    @Override
    public Behaviour play() {
        Behaviour behaviour;
        if (currentRoundInfo.behaviour == null || currentRoundInfo.round == 0) {
            behaviour =  Behaviour.Cooperate;
        } else {
            behaviour =  currentRoundInfo.behaviour;
        }
        currentRoundInfo.round++;
        return behaviour;
    }
}
