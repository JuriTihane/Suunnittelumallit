package TemplateMethod;

import java.util.Random;

public class DiceGame extends Game {
    private boolean pair = false;
    private int player;

    @Override
    void initializeGame() {
        System.out.println("Player who will get same numbers from both dices will win!");
    }

    @Override
    void play(int player) {
        int dice1 = Dice(1,6);
        int dice2 = Dice(1,6);
        System.out.println("Player's " + player + " dices numbers are: " + dice1 + " and " + dice2);
        if (dice1 == dice2) {
            pair = true;
            this.player = player;
        }
    }

    @Override
    boolean endOfGame() {
        return pair;
    }

    @Override
    void printWinner() {
        System.out.println("Player " + player+ " got a pair and won the game!");
    }

    private static int Dice(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
