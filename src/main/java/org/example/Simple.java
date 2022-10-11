package org.example;

public interface Simple <T> extends Iterable{
    boolean add(T e);
    void delete(int index);
    T get(int index);
    int size();
    void update(int index, T e);
}
