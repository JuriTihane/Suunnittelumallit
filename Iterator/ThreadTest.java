package Iterator;

import java.util.Iterator;

public class ThreadTest extends Thread {
    private Iterator<String> iterator;
    private int i;
    int j = 0;

    public ThreadTest(Iterator<String> iterator, int i) {
        this.iterator = iterator;
        this.i = i;
    }

    public void run(){
        while (this.iterator.hasNext()) {
            System.out.println("Iterator " + i + ", index " + j + ": " + this.iterator.next());
            j++;
        }
    }
}
