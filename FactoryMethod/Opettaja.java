package FactoryMethod;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(String drink) {
        switch (drink) {
            case "Vesi" -> {
                return new Vesi();
            }
            case "Limu" -> {
                return new Limu();
            }
            case "Kahvi" -> {
                return new Kahvi();
            }
        }
        return null;
    }
}