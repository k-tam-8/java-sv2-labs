package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> items = new ArrayList<>();
    private int cursor = 0;

    public SimpleBag() {
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursor = 0;
    }

    public boolean hasNext() {
        return items.size() > cursor;
    }

    public Object next() {
        return items.get(cursor + 1);
    }

    public boolean contains(Object item) {
        return item == null;
    }

    public int getCursor() {
        return cursor;
    }
}
