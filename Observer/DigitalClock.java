package Observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        timer.tick();
        draw();
    }

    private void draw() {
        System.out.println("Hour: " + timer.getHour() + ", minute: " + timer.getMinute() + ", second: " + timer.getSecond());
    }
}
