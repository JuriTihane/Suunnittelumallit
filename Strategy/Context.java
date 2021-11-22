package Strategy;

import java.util.List;

public class Context {
    private final ListConverter converter;

    public Context(ListConverter converter) {
        this.converter = converter;
    }

    public void executeList(List<String> list) {
        converter.listToString(list);
    }
}
