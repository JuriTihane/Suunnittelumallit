package Visitor;

public class VisitorMain {
    public static void main(String[] args) {
        Evolution charmander = new Charmander();
        Evolution charmander2 = new Charmander();
        Pokemon p = new Pokemon(0,  charmander);
        Pokemon p2 = new Pokemon(50, charmander2);
        Visitor visit = new PokemonVisitor();

        for(int i = 0; i < 20; i++) {
            p.runState(visit);
            p.attackState(visit);
            p.defendState(visit);
            p2.runState(visit);
            p2.attackState(visit);
            p2.defendState(visit);
        }
    }
}
