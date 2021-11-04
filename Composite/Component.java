package Composite;

public interface Component {
    void addComponent(Component component);
    Integer getCost();
    void printComponent();
}
