package AbstractFactory;

public class AdidasJasper implements GUITehdas {
    @Override
    public AdidasFarmari createFarmari() {
        return new AdidasFarmari();
    }

    @Override
    public Tpaita createTpaita() {
        return new AdidasTpaita();
    }

    @Override
    public Lippis createLippis() {
        return new AdidasLippis();
    }

    @Override
    public Kengat createKengat() {
        return new AdidasKengat();
    }
}