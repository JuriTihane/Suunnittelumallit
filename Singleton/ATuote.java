package Singleton;

public class ATuote implements Tuote {
    @Override
    public void makeService() {
        System.out.println("ATuote tuoteuttaa tilauksen");
    }
}
