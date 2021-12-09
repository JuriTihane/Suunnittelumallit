package Prototype;

public class Kello implements Cloneable {
    private Viisari tunti;
    private Viisari minuutti;


    public Kello() {
        this.tunti = new Viisari(24);
        this.minuutti = new Viisari(60);
    }

    public String aika() {
        return tunti+":"+minuutti;
    }

    public void asetaAika(int h, int m) {
        this.tunti.setAika(h);
        this.minuutti.setAika(m);
    }

    public Object klooni() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Kello syvaKopio() {
        Kello kello;
        try {
            kello = (Kello)super.clone();
            kello.tunti = (Viisari) this.tunti.clone();
            kello.minuutti = (Viisari) this.minuutti.clone();
            return kello;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
