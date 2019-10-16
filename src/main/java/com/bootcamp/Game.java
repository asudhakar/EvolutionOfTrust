package com.bootcamp;

public class Game {
    CurrentBehaviourObserver currentBehaviourObserver;

    private Score score = new Score(0, 0);
    private Player player1;
    private Player player2;
    private int numberOfRounds;

    Behaviour playerOneInput;
    Behaviour playerTwoInput;

    public Game(Player player1, Player player2, int numberOfRounds,CurrentBehaviourObserver currentBehaviourObserver) {
        this.player1 = player1;
        this.player2 = player2;
        this.numberOfRounds = numberOfRounds;
        this.currentBehaviourObserver = currentBehaviourObserver;
    }

    public Score start() {
        for (int i = 0; i < this.numberOfRounds; i++) {
            playerOneInput = player1.play();
            currentBehaviourObserver.update(playerOneInput);
            playerTwoInput = player2.play();
            currentBehaviourObserver.update(playerTwoInput);
            Score roundScore = rule(playerOneInput, playerTwoInput);
            score.updateScores(roundScore.getPlayer1Score(), roundScore.getPlayer2Score());
            currentBehaviourObserver.firstMove = false;
        }

        return score;
    }

    public Score rule(Behaviour player1Input, Behaviour player2Input) {
        if (player1Input.equals(Behaviour.Cooperate) && player2Input.equals(Behaviour.Cooperate)) {
            return new Score(2, 2);
        }
        if (player1Input.equals(Behaviour.Cooperate) && player2Input.equals(Behaviour.Cheat)) {
            return new Score(-1, 3);
        }
        if (player1Input.equals(Behaviour.Cheat) && player2Input.equals(Behaviour.Cooperate)) {
            return new Score(3, -1);
        }
        if (player1Input.equals(Behaviour.Cheat) && player2Input.equals(Behaviour.Cheat)) {
            return new Score(0, 0);
        }

        return null;
    }
}
