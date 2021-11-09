package Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        // Katsotaan jos sama tulos
        AconcreteTehdas aconcreteTehdas = AconcreteTehdas.getInstance();
        AconcreteTehdas aconcreteTehdas1 = AconcreteTehdas.getInstance();
        System.out.println(aconcreteTehdas==aconcreteTehdas1);

        // Tulostetaan ATuote tuote
        Tuote aTuote = aconcreteTehdas.makeProduct();
        aTuote.makeService();
    }
}
