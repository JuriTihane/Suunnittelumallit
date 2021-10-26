package factorymethod;

import org.jetbrains.annotations.NotNull;

public abstract class AterioivaOtus {

    Juoma juoma = null;

    public abstract Juoma createJuomaVesi();
    public abstract Juoma createJuomaKahvi();
    public abstract Juoma createJuomaLimu();

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
        juoma = createJuomaVesi();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }

    public void juoLimu() {
        juoma = createJuomaLimu();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }

    public void juoKahvi() {
        juoma = createJuomaKahvi();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}