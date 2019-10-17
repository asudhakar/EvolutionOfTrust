package com.bootcamp;

import java.util.Arrays;
import java.util.List;

public class DetectiveBehaviour extends PlayerBehaviour {
    private List<Move> moves = Arrays.asList(Move.Cooperate,
            Move.Cheat,
            Move.Cooperate,
            Move.Cooperate);

    @Override
    Move play() {

        DetectiveObserver detectiveObserver = DetectiveObserver.getInstance();
        if (detectiveObserver.round <= 4) {
           return moves.get(detectiveObserver.round-1);
        } else if (detectiveObserver.round > 4 && !detectiveObserver.isNonDetectivePlayerCheated) {
            return Move.Cheat;
        }else {
            return null;
        }
    }
}
