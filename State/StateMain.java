package State;

public class StateMain {
    public static void main(String[] args) {
        Pokemon p = new Pokemon();

        for(int i = 0; i < 20; i++) {
            p.runState();
            p.attackState();
            p.defendState();
            p.evolution();
        }
    }
}
