package Strategy;

import java.util.List;

public class Table implements ListConverter {
    int i = 0;

    @Override
    public void listToString(List<String> list) {
        String[] arr = list.toArray(new String[0]);

        for (String x : arr) {
            System.out.print(x);
            i++;
            if (i % 2 == 0) {
                System.out.print("\n");
            }
        }
    }
}
