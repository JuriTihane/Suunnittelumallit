package Decorator;

public class PizzaTayteDecorator extends PizzaDecorator {
    public PizzaTayteDecorator (Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    @Override
    public void draw() {
        super.draw(); // Abstraktin luokan delegointimetodin kutsu (= ”sisus.draw()”)
        drawPizzaTayte(); // lisätty toiminnallisuus
    }
    private void drawPizzaTayte() {
        System.out.println("Draw pizza tayte");
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", pizza get description";
    }
}
