package Memento;

public class Guesser {
    public Guesser(){}

    public void joinGame(Customer guesser){
        guesser.giveNumberFromGuesser(new Memento((int) (Math.random() * 10)));
    }

    public void checkNumber(Customer guesser, int guess){
        Memento memento = (Memento) guesser.mementoToGuesser();

        if(memento.getCorrectNumber() == guess) {
            System.out.println(guesser.getGuesserName() + " guess of " + guess + " was correct!\n");
            guesser.stopGuessing();
        } else {
            System.out.println(guesser.getGuesserName() + " guess of " + guess + " was incorrect!\n");
        }
    }

    private class Memento {
        private final int correctNumber;

        public Memento(int numero){
            correctNumber = numero;
        }

        public int getCorrectNumber(){
            return correctNumber;
        }
    }
}
