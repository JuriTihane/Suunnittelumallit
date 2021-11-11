package Decorator;

public class PizzaPohjaDecorator extends PizzaDecorator {
    public PizzaPohjaDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public String getPrize() {
        return super.getPrize();
    }
}
