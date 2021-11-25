package Memento;

public class Customer extends Thread {
    private Guesser guesser;
    private Object memento;
    private String name;
    private int guesses;

    private volatile boolean guessing;

    public Customer(String name, Guesser guesser){
        this.name = name;
        this.guesser = guesser;
        guesses = 0;
        guessing = true;
    }

    @Override
    public void run() {

        guesser.joinGame(this);
        System.out.println(name + " starts guessing!");

        while(guessing){

            int guess = (int)Math.round(Math.random() * 10);
            guessNumber(guess);

            try {
                Thread.sleep(MementoMain.SLEEP_TIME);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void guessNumber(int numero){
        guesses++;
        guesser.checkNumber(this, numero);
    }

    public void giveNumberFromGuesser(Object memento){
        this.memento = memento;
    }

    public String getGuesserName() {
        return name;
    }

    public int getGuesses(){
        return guesses;
    }

    public Object mementoToGuesser(){
        return memento;
    }

    public void stopGuessing(){
        guessing = false;
    }
}
