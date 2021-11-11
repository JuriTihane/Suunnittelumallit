package Decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaToBeDecorated;

    public PizzaDecorator (Pizza pizzaToBeDecorated) {
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }
    public String getPrize() {
        return pizzaToBeDecorated.getPrize();
    }
}
