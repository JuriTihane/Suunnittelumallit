package Visitor;

// Turhat getterin ja setterit jätetty poiss
public class Pokemon {
    private int xp = 0;
    private String name;
    private Evolution state = new Charmander();

    public Pokemon(int xp, Evolution state) {
        super();
        this.xp = xp;
        this.state = state;
    }

    public void setState(Evolution state) {
        this.state = state;
    }

    public int getXP() {
        return xp;
    }

    public String getName() {
        name = state.getEvolution();
        return name;
    }

    public void runState(Visitor visit) {
        state.run(this);
        xp = xp +10;
        visit.visit(this);
    }

    public void attackState(Visitor visit) {
        state.attack(this);
        xp = xp +10;
        visit.visit(this);
    }

    public void defendState(Visitor visit) {
        state.defend(this);
        xp = xp +10;
        visit.visit(this);
    }

    public void evolution() {
        if (xp > 90) {
            state.evolution(this);
            xp = 0;
        }
    }
}
