import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private final List<T> items = new ArrayList<>();

    public void put(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
