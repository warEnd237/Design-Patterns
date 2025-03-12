import java.util.List;

public class PancakeHouseIterator implements Iterator {
    List<MenuItem> items;
    int index;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return index < items.size();
    }

    public MenuItem next() {
        return items.get(index++);
    }
}
