package Visitor;

public class PokemonVisitor implements Visitor {
    @Override
    public void visit(Pokemon p) {
        int xp = p.getXP();
        String name = p.getName();

        switch(name) {
            case "Charmander":
                if (xp > 100) {
                    p.evolution();
                }
                break;
            case "Charmeleon":
                if (xp > 300) {
                    p.evolution();
                }
                break;
            case "Charizard":
                break;
        }
    }
}
