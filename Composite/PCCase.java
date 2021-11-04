package Composite;

import java.util.ArrayList;
import java.util.List;

public class PCCase implements Component {
    private Integer cost;
    private String name;
    private List<Component> childComponents;

    public PCCase(Integer cost, String name) {
        this.cost = cost;
        this.name = name;
        this.childComponents = new ArrayList<>();
    }

    public void addComponent(Component component) {
        childComponents.add(component);
    }

    public void removeComponent(Component component) {
        childComponents.remove(component);
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public void printComponent() {
        for (Component c : childComponents) {
            c.printComponent();
        }

        int costSum = cost;
        for (Component c : childComponents) {
            costSum += c.getCost();
        }
        System.out.println("Komponentin tyyppi: " + getClass().getSimpleName() + ", Komponentin nimi: " + name + ", hinta: " + cost);
        System.out.println("Kaikkien komponenttien hinnat yhteensä: " + costSum);
    }
}
