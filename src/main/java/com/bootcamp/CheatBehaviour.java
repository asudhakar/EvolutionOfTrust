package com.bootcamp;

public class CheatBehaviour extends PlayerBehaviour {


    public CheatBehaviour(CurrentRoundInfo currentRoundInfo) {
        super(currentRoundInfo);
    }

    @Override
    public Behaviour play() {
        return Behaviour.Cheat;
    }
}
