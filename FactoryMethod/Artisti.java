package FactoryMethod;

public class Artisti extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Kahvi();
    }
}