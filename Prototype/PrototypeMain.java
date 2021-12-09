package Prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Kello kello = new Kello();
        Kello kopio = (Kello) kello.klooni();
        Kello syva = kello.syvaKopio();

        System.out.println("Kello:" + kello.aika() + " Kopio:" + kopio.aika() + " Syvkopio:" + syva.aika());

        kello.asetaAika(14, 30);
        System.out.println("Kello:" + kello.aika() + " Kopio:" + kopio.aika() + " Syvkopio:" + syva.aika());

        kopio.asetaAika(22, 10);
        System.out.println("Kello:" + kello.aika() + " Kopio:" + kopio.aika() + " Syvkopio :" + syva.aika());

        syva.asetaAika(2, 58);
        System.out.println("Kello:" + kello.aika() + " Kopio:" + kopio.aika() + " Syvkopio :" + syva.aika());
    }
}
