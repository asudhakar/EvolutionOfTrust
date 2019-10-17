package com.bootcamp;

public class DetectiveObserver implements BehaviourObserver {
    public Boolean isNonDetectivePlayerCheated = false;
    public int round = 1;

    private static DetectiveObserver detectiveObserver = new DetectiveObserver();
    private DetectiveObserver() {
    }

    public static DetectiveObserver getInstance() {
        return detectiveObserver;
    }


    @Override
    public void update(Move move, Player player) {
        if (!(player.getBehaviour() instanceof DetectiveBehaviour) &&
                move.equals(Move.Cheat)
        ) {
            isNonDetectivePlayerCheated = true;
        }
    }
}
