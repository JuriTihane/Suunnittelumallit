package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi("Vesi");
        opettaja.aterioi("Limu");
        opettaja.aterioi("Kahvi");
    }
}