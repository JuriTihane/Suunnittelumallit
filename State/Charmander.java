package State;

public class Charmander implements Evolution {
    @Override
    public void attack(Pokemon p) {
        System.out.println("Charmander is attacking");
    }

    @Override
    public void defend(Pokemon p) {
        System.out.println("Charmander is defending");
    }

    @Override
    public void run(Pokemon p) {
        System.out.println("Charmander is running");
    }

    @Override
    public void evolution(Pokemon p) {
        p.setState(new Charmeleon());
    }
}