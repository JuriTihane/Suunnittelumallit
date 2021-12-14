package Iterator;

import java.util.Iterator;

public class RemoveIteratorTest extends Thread {
    private Iterator<String> iterator;
    private int i;
    int j = 0;

    public RemoveIteratorTest(Iterator<String> iterator, int i) {
        this.iterator = iterator;
        this.i = i;
    }

    public void run(){
        while (this.iterator.hasNext()) {

            if(this.iterator.next().equals("two")) {
                this.iterator.remove();
                //break;
            }

            System.out.println("Iterator " + i + ", index " + j + ": " + this.iterator.next());
            j++;
        }
    }
}
