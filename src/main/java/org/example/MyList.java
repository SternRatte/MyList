package org.example;

import java.util.Iterator;

/**
 * Container class
 */
public class MyList<T> implements Simple<T>{
    /**
     * the base of an array-based container
     */
    private T[] values ;

    /**
     * creating a new object
     */
    public MyList() {
        values = (T[]) new Object[0];
    }

    /**
     * The function of adding an element to the container
     * @param e item to add
     * @return true if the element was successfully added
     */
    @Override
    public boolean add(T e) {
        try{
            T[] temp = values;
            values = (T[]) new Object[temp.length+1];
            System.arraycopy(temp, 0,values,0,temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     *Method of deleting an element
     * @param index index of the item to delete
     */
    @Override
    public void delete(int index) {
        try{
            T[] temp = values;
            values = (T[]) new Object[temp.length-1];
            System.arraycopy(temp,0,values,0,index);
            int ElemAfterIndex = temp.length - index - 1 ;
            System.arraycopy(temp,index + 1, values,index,ElemAfterIndex);
        } catch (ClassCastException ex)
        {
            ex.printStackTrace();
        }
    }

    /**
     * Method for getting the element value
     * @param index index of the element to get the value
     * @return value of the element with the given index
     */
    @Override
    public T get(int index) {
        return values[index];
    }

    /**
     * returns the size of the container
     * @return size of the container
     */
    @Override
    public int size() {
        return values.length;
    }

    /**
     * Method for changing the container element
     * @param index index of the element to replace
     * @param e replacement value
     */
    @Override
    public void update(int index, T e) {
       values[index] = e;
    }

    /**
     * Iterator implementation method
     * @return  new iterator
     * @see ArrayIterator#ArrayIterator(Object[]) 
     */
    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
}
