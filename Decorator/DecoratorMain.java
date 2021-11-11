package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza salmiakkiPizza = new PizzaPohjaDecorator(new PizzaPohjaDecorator(new SalmiakkiDecorator()));
        Pizza chickenPizza = new PizzaPohjaDecorator(new PizzaPohjaDecorator(new ChickenDecorator()));
        Pizza fishPizza = new PizzaPohjaDecorator(new PizzaPohjaDecorator(new FishDecorator()));

        System.out.println("Price of salmiakki pizza: " + salmiakkiPizza.getPrize());
        System.out.println("Price of chicken pizza: " + chickenPizza.getPrize());
        System.out.println("Price of fish pizza: " + fishPizza.getPrize());
    }
}
