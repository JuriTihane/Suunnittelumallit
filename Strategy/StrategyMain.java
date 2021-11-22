package Strategy;

import java.util.LinkedList;
import java.util.List;

public class StrategyMain {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("My");
        list.add("Name");
        list.add("Is");
        list.add("Jüri");
        list.add("And");
        list.add("Now");
        list.add("I");
        list.add("Am");
        list.add("Testing");
        list.add("My");
        list.add("Code");

        Context context = new Context(new Iterator2());
        System.out.println("Iterator - Change row after EVERY list object\n");
        context.executeList(list);

        System.out.println("\n");

        Context context2 = new Context(new Table());
        System.out.println("Table - Change row after every SECOND list object\n");
        context2.executeList(list);

        System.out.println("\n");

        Context context3 = new Context(new ForLoop());
        System.out.println("For loop - Change row after every THIRD list object\n");
        context3.executeList(list);
    }
}
