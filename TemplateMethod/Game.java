package TemplateMethod;

abstract class Game {
    protected int playersCount;
    abstract void initializeGame();
    abstract void play(int player);
    abstract boolean endOfGame();
    abstract void printWinner();

    /* A template method : */
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();

        int i = 0;
        while (!endOfGame()){
            play(i);
            i = (i + 1) % playersCount;
        }

        printWinner();
    }
}
