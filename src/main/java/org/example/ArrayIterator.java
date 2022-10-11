package org.example;
import java.util.Iterator;

/**
 * Template iterator
 */
public class ArrayIterator <T> implements Iterator {
    private T[] values;
    private int index = 0;

    ArrayIterator(T[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}

