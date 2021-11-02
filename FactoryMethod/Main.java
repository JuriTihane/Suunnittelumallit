package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus artisti = new Artisti();
        opettaja.aterioi();
        opiskelija.aterioi();
        artisti.aterioi();
    }
}