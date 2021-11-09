package Singleton;

public class BTuote implements Tuote {
    @Override
    public void makeService() {
        System.out.println("Btuote toteuttaa tilauksen");
    }
}
