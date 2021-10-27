package FactoryMethod;

import org.jetbrains.annotations.NotNull;

public abstract class AterioivaOtus {

    Juoma juoma = null;

    public abstract Juoma createJuoma(String juoma);

    public void aterioi(@NotNull String drink) {
        switch (drink) {
            case "Vesi" -> {
                syo();
                juoVesi();
            }
            case "Limu" -> {
                syo();
                juoLimu();
            }
            case "Kahvi" -> {
                syo();
                juoKahvi();
            }
        }
    }

    public void syo() {
        System.out.println("Kylläpä ruoka maistuukin hyvältä");
    }

    public void juoVesi() {
        juoma = createJuoma("Vesi");
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }

    public void juoLimu() {
        juoma = createJuoma("Limu");
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }

    public void juoKahvi() {
        juoma = createJuoma("Kahvi");
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}