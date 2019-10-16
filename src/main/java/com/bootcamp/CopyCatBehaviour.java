package com.bootcamp;

public class CopyCatBehaviour extends PlayerBehaviour {


    @Override
    public Behaviour play() {
        CurrentBehaviourObserver currentBehaviourObserver = CurrentBehaviourObserver.getInstance();
        if (currentBehaviourObserver.firstMove || currentBehaviourObserver.behaviour == null) {
            return Behaviour.Cooperate;
        } else {
            return currentBehaviourObserver.behaviour;
        }
    }
}
