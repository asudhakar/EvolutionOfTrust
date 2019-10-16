package com.bootcamp;

public class CurrentBehaviourObserver implements PreviousBehaviourObserver {
    Behaviour behaviour;
    public Boolean firstMove =  true;

    private static CurrentBehaviourObserver currentBehaviourObserver;
    private CurrentBehaviourObserver() {}

    public static CurrentBehaviourObserver getInstance() {
        if (currentBehaviourObserver == null) {
            currentBehaviourObserver = new CurrentBehaviourObserver();
        }
        return currentBehaviourObserver;
    }

    @Override
    public void update(Behaviour behaviour) {
        this.behaviour = behaviour;
    }


}
