package Observer;

import java.util.Timer;
import java.util.TimerTask;

public class MainObserver {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);

        // TODO: OTA KOMMENTIN POISS TÄSTÄ BLOKISTA, JOS HALUAT NÄHDÄ REAALIAJASSA
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.tick();
            }
        }, 0, 1000);

        // Simulointi, vaihda argumenttia jos haluat vaihtaa simuloinnin aikaa, tunnit jatkuvat loputtomiin

    }
}
