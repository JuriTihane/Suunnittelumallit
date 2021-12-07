package Visitor;

public interface Evolution {
    String getEvolution();
    void attack(Pokemon p);
    void defend(Pokemon p);
    void run(Pokemon p);
    void evolution(Pokemon p);
}
