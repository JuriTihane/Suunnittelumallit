package Builder;

public class Hesburger implements HamburgerChain {
    public DataStructure cookHamburger() {
        DataStructureList meal = new DataStructureList();
        meal.addItem(new FloorHamburger());
        return meal;
    }
}
