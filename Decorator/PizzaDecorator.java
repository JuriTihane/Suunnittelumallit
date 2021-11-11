package Decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaToBeDecorated;

    public PizzaDecorator (Pizza pizzaToBeDecorated) {
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }
    public void draw() {
        pizzaToBeDecorated.draw(); //Delegointi sisukselle
    }
    public String getDescription() {
        return pizzaToBeDecorated.getDescription(); //Delegointi
    }
}
