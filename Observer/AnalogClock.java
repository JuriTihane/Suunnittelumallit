package Observer;

import java.util.Observable;
import java.util.Observer;

public class AnalogClock implements Observer {
    private ClockTimer timer;

    public AnalogClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        draw((int[]) arg);
    }

    private void draw(int[] t) {
//        System.out.println("Hour: " + timer.getHour() + ", minute: " + timer.getMinute() + ", second: " + timer.getSecond());
        System.out.println("Hour: " + t[2] + " Minute: " + t[1] + " Second: " + t[0]);
    }
}
