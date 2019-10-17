package com.bootcamp;

public class CurrentBehaviourObserver implements BehaviourObserver {
    Move move;
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
    public void update(Move move, Player player) {
        this.move = move;
    }


}
