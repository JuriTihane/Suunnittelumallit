package Prototype;

public class Viisari implements Cloneable {
    private int aika, max;

    public Viisari(int max) {
        this.aika = 0;
        this.max = max;
    }

    public void setAika(int time) {
        this.aika = time;
        System.out.println(time);
    }

    @Override
    public String toString() {
        return String.valueOf(this.aika);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
