package Strategy;

import java.util.List;

public class ForLoop implements ListConverter {
    @Override
    public void listToString(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if ((i + 1) % 3 == 0 ) {
                System.out.print("\n");
            }
        }
    }
}
