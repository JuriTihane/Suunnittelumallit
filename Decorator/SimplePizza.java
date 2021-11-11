package Decorator;

public class SimplePizza implements Pizza {
    public void draw() {
        System.out.println("Drawing");
    }

    public String getDescription() {
        return "Simple pizza";
    }
}
