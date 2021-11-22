package Strategy;

import java.util.Iterator;
import java.util.List;

// Jouduin antaa numero 2 perään..
public class Iterator2 implements ListConverter {
    @Override
    public void listToString(List<String> list) {

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + "\n");
        }
    }
}
