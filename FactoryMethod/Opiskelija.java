package FactoryMethod;

public class Opiskelija extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Limu();
    }
}