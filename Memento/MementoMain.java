package Memento;

public class MementoMain {
    static final long SLEEP_TIME = 400;

    public static void main(String[] args) throws InterruptedException {
        Guesser guesser = new Guesser();

        Customer[] customers = new Customer[4];
        customers[0] = new Customer("Kyle", guesser);
        customers[1] = new Customer("Sten", guesser);
        customers[2] = new Customer("Matt", guesser);
        customers[3] = new Customer("John", guesser);

        for (int i = 0; i < customers.length; i++) {
            customers[i].start();
        }

        for (int i = 0; i < customers.length; i++) {
            customers[i].join();
        }

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].getGuesserName() + " guessed correctly after " + customers[i].getGuesses() + " tries!");
        }

    }
}
