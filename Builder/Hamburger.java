package Builder;

public abstract class Hamburger implements HamburgerInterface {
    @Override
    public SaladInterface addSalad() {
        return new JaavuoriSalad();
    }
    @Override
    public ProteinInterface addPatty() {
        return new Patty();
    }

    @Override
    public abstract float prize();
}
