package com.bootcamp;

public class CopyCatBehaviour extends PlayerBehaviour {


    @Override
    public Move play() {
        CurrentBehaviourObserver currentBehaviourObserver = CurrentBehaviourObserver.getInstance();
        if (currentBehaviourObserver.firstMove || currentBehaviourObserver.move == null) {
            return Move.Cooperate;
        } else {
            return currentBehaviourObserver.move;
        }
    }
}
