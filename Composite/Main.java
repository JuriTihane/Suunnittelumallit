package Composite;

public class Main {
    public static void main(String[] args) {
        Component GPU = new GPU(1000, "Nvidia");
        Component CPU = new CPU(300, "Intel");

        PCCase pcCase = new PCCase(100, "Corsair");

        pcCase.addComponent(GPU);
        pcCase.addComponent(CPU);

        pcCase.printComponent();
    }
}