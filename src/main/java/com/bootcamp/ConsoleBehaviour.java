package com.bootcamp;

public class ConsoleBehaviour extends PlayerBehaviour {
    private ScannerWrapper wrapper;


    public ConsoleBehaviour(CurrentRoundInfo currentRoundInfo, ScannerWrapper wrapper) {
        super(currentRoundInfo);
        this.wrapper = wrapper;
    }


    @Override
    public Behaviour play() {
        if (this.wrapper.readInput().equals("CH"))
            return Behaviour.Cheat;
        else
            return Behaviour.Cooperate;
    }
}
