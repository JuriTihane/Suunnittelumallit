package Observer;

import java.util.Observable;

public class ClockTimer extends Observable {
    private int second;
    private int minute;
    private int hour;

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    // Omfg anteeks tästä
    void tick() {
        if (second < 59) {
            second++;
        } else {
            if (minute < 59) {
                second = 0;
                minute++;
            } else {
                if (hour < 60) {
                    second = 0;
                    minute = 0;
                    hour++;
                }
            }
        }
    }
}