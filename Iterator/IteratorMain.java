package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {

        List<String> collection = new ArrayList<>();
        ThreadTest t1;
        ThreadTest t2;
        RemoveIteratorTest tr1;

        String zero = "zero";
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";

        collection.add(zero);
        collection.add(one);
        collection.add(two);
        collection.add(three);
        collection.add(four);

        Iterator<String> iterator = collection.iterator();
        Iterator<String> iterator2 = collection.iterator();

        // Vaihda swtichin parametri eri skenaarioita varten
        switch (1) {
            // Kaksi iteraattoria
            case 1:
                t1 = new ThreadTest(iterator, 1);
                t2 = new ThreadTest(iterator2, 2);

                t1.start();
                t2.start();
                break;

            case 2:
                // Yksi iteraattori
                t1 = new ThreadTest(iterator, 1);
                t2 = new ThreadTest(iterator, 2);

                t1.start();
                t2.start();
                break;

            case 3:
                // Muutoksia ajon aikana
                t1 = new ThreadTest(iterator, 1);
                t1.start();
                collection.add(new String("five"));
                break;

            case 4:
                // Remove testi
                tr1 = new RemoveIteratorTest(iterator, 1);
                tr1.start();
                break;
        }
    }
}
