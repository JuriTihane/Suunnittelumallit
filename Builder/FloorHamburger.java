package Builder;

public class FloorHamburger extends Hamburger {
    @Override
    public String name() {
        return "floor Hamburger:";
    }

    @Override
    public float prize() {
        return (float) 10.0;
    }
}
