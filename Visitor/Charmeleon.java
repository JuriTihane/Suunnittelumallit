package Visitor;

public class Charmeleon implements Evolution {
    private String evolution = "Charmeleon";

    @Override
    public String getEvolution() {
        return evolution;
    }

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
        System.out.println("Charmeleon evolved into Charizard!");
    }
}