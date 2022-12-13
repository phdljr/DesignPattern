package hf.dp.iterator.iterator;

import hf.dp.iterator.menu.MenuItem;

import java.util.Iterator;
import java.util.function.Consumer;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Can't remove menu.");
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null)
            return false;
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position++];
        return menuItem;
    }
}
