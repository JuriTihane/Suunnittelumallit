package Observer;

import java.util.Observable;
import java.util.Observer;

public class AnalogClock implements Observer {
    private ClockTimer timer;

    public AnalogClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver((Observer) this);
    }

    @Override
    public void update(Observable o, Object arg) {
        timer.tick();
        draw();
    }

    private void draw() {
        System.out.println(timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
    }
}