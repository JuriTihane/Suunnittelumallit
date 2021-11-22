package State;

// Turhat getterin ja setterit jätetty poiss
public class Pokemon {
    private int xp = 0;
    private Evolution state = new Charmander();

    public void setState(Evolution state) {
        this.state = state;
    }

    public void runState() {
        state.run(this);
        xp = xp +10;

    }

    public void attackState() {
        state.attack(this);
        xp = xp +10;
    }

    public void defendState() {
        state.defend(this);
        xp = xp +10;
    }

    public void evolution() {
        if (xp > 90) {
            state.evolution(this);
            xp = 0;
        }
    }
}
