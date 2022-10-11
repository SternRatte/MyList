package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class TestMyList {

    Simple<String> list1 ;

    @BeforeEach
    public void prepareDate(){
        list1 = new MyList<>();
        list1.add("first");
        list1.add("second");
        list1.add("third");
    }

    @Test
    public void testAddMethod() {
        list1.add("four");
        assertEquals("four", list1.get(3));
    }

    @Test
    public void testDeleteMethod() {
        list1.delete(1);
        assertEquals(2,list1.size());
        assertEquals("third",list1.get(1));
    }

    @Test
    public void testGetMethod() {
        assertEquals("second", list1.get(1));
    }

    @Test
    public void testSizeMethod() {
        assertEquals(3,list1.size());
    }

    @Test
    public void testUpdateMethod() {
        list1.update(2,"update");
        assertEquals("update", list1.get(2));
    }
}