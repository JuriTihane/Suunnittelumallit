package Composite;

public class CPU implements Component {
    private Integer cost;
    private String name;

    public CPU(Integer cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public void addComponent(Component component) {
    }

    @Override
    public void printComponent() {
        System.out.println("Komponentin tyyppi: " + getClass().getSimpleName() + ", Komponentin nimi: " + name + ", hinta: " + cost);
    }

    @Override
    public Integer getCost() {
        return cost;
    }
}
