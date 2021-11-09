package Observer;

import java.util.Observable;

public class ClockTimer extends Observable {
    private int second;

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return (second / 60);
    }

    public int getHour() {
        return ((second / 60) / 60);
    }

    void tick() {
        second++;
    }
}