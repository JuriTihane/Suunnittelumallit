package AbstractFactory;

public class BossJasper implements GUITehdas{
    @Override
    public Farmari createFarmari() {
        return new BossFarmari();
    }

    @Override
    public Tpaita createTpaita() {
        return new BossTpaita();
    }

    @Override
    public Lippis createLippis() {
        return new BossLippis();
    }

    @Override
    public Kengat createKengat() {
        return new BossKengat();
    }
}
