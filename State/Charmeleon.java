package State;

public class Charmeleon implements Evolution {
    @Override
    public void attack(Pokemon p) {
        System.out.println("Charmeleon is attacking");
    }

    @Override
    public void defend(Pokemon p) {
        System.out.println("Charmeleon is defending");
    }

    @Override
    public void run(Pokemon p) {
        System.out.println("Charmeleon is running");
    }

    @Override
    public void evolution(Pokemon p) {
        p.setState(new Charizard());
    }
}