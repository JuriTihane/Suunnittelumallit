package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza decoratedPizza = new PizzaTayteDecorator (new PizzaTayteDecorator (new SimplePizza()));
        System.out.println(decoratedPizza.getDescription());
    }
}
