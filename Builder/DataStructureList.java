package Builder;

import java.util.ArrayList;
import java.util.List;

public class DataStructureList implements DataStructure {
    private List<HamburgerInterface> items = new ArrayList<HamburgerInterface>();

    public void addItem(HamburgerInterface item){
        items.add(item);
    }

    public float getPrize(){
        float cost = 0.0f;

        for (HamburgerInterface hamburger : items) {
            cost += hamburger.prize();
        }
        return cost;
    }

    public void getBurger(){
        for (HamburgerInterface hamburger : items) {
            System.out.println("Hesburger " + hamburger.name());
            System.out.println("Contains : " + hamburger.addPatty().add() + ", " + hamburger.addSalad().add());
        }
    }
}
