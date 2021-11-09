package Observer;

public class MainObserver {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);

        analogClock.update(timer, analogClock);
        analogClock.update(timer, digitalClock);
    }
}
