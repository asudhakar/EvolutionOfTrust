package com.bootcamp;

public class Game {
    BehaviourObserver behaviourObserver;

    private Score score = new Score(0, 0);
    private Player player1;
    private Player player2;
    private int numberOfRounds;

    Move playerOneInput;
    Move playerTwoInput;

    public Game(Player player1, Player player2, int numberOfRounds,BehaviourObserver behaviourObserver) {
        this.player1 = player1;
        this.player2 = player2;
        this.numberOfRounds = numberOfRounds;
        this.behaviourObserver = behaviourObserver;
    }

    public Score start() {
        for (int i = 0; i < this.numberOfRounds; i++) {
            playerOneInput = player1.play();
            behaviourObserver.update(playerOneInput, player1);
            playerTwoInput = player2.play();
            behaviourObserver.update(playerTwoInput, player2);
            Score roundScore = rule(playerOneInput, playerTwoInput);
            score.updateScores(roundScore.getPlayer1Score(), roundScore.getPlayer2Score());
            if (behaviourObserver instanceof CurrentBehaviourObserver) {
                ((CurrentBehaviourObserver)behaviourObserver).firstMove = false;
            } else if (behaviourObserver instanceof DetectiveObserver) {
                ((DetectiveObserver)behaviourObserver).round++;
            }
        }

        return score;
    }

    public Score rule(Move player1Input, Move player2Input) {
        if (player1Input.equals(Move.Cooperate) && player2Input.equals(Move.Cooperate)) {
            return new Score(2, 2);
        }
        if (player1Input.equals(Move.Cooperate) && player2Input.equals(Move.Cheat)) {
            return new Score(-1, 3);
        }
        if (player1Input.equals(Move.Cheat) && player2Input.equals(Move.Cooperate)) {
            return new Score(3, -1);
        }
        if (player1Input.equals(Move.Cheat) && player2Input.equals(Move.Cheat)) {
            return new Score(0, 0);
        }

        return null;
    }
}
