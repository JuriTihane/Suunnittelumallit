package State;

public interface Evolution {
    void attack(Pokemon p);
    void defend(Pokemon p);
    void run(Pokemon p);
    void evolution(Pokemon p);
}
