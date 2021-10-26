package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuomaVesi() {
        return new Vesi();
    }

    public Juoma createJuomaLimu() {
        return new Limu();
    }

    public Juoma createJuomaKahvi() {
        return new Kahvi();
    }
}