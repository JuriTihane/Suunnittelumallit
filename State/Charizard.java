package State;

public class Charizard implements Evolution {
    @Override
    public void attack(Pokemon p) {
        System.out.println("Charizard is attacking");
    }

    @Override
    public void defend(Pokemon p) {
        System.out.println("Charizard is defending");
    }

    @Override
    public void run(Pokemon p) {
        System.out.println("Charizard is running");
    }

    @Override
    public void evolution(Pokemon p) {
        System.out.println("Charizard can't evolve more than this!");

    }
}
