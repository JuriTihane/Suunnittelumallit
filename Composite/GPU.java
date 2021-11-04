package Composite;

public class GPU implements Component {
    private Integer cost;
    private String name;

    public GPU(Integer cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public void printComponent() {
        System.out.println("Komponentin nimi: " + name + ", hinta: " + cost);
    }

    public void addComponent(Component component) {
    }
}
