package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    @Test
    public void testMethodAdd() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(100);
        test = test.add(247);
        test = test.add(7);
        ImmutableList actualResult = test;
        assertEquals("100-->247-->7-->", actualResult.toString());
    }
    @Test
    public void testMethodAddIndex() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 893);
        test = test.add(1, 900);
        test = test.add(2, 900);
        test = test.add(3, 10);
        test = test.add(4, 100);
        ImmutableList actualResult = test;
        assertEquals("893-->900-->900-->10-->100-->", actualResult.toString());
    }
    @Test
    public void testMethodAddIndex_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(893);
        test = test.add(900);
        test = test.add(1, 100);
        ImmutableList actualResult = test;
        assertEquals("893-->100-->900-->", actualResult.toString());
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodAddIndex_3() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(100);
        test = test.add(247);
        test = test.add(7);
        test.add(4, 9);
    }
    @Test
    public void testMethodAddAll() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1100);
        test = test.addAll(new Integer [] {2, 3, 4, 6});
        ImmutableList actualResult = test;
        assertEquals("1100-->2-->3-->4-->6-->", actualResult.toString());
    }
    @Test
    public void testMethodAddAll_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.addAll(new Integer [] {2, 3, 4, 6});
        ImmutableList actualResult = test;
        assertEquals("2-->3-->4-->6-->", actualResult.toString());
    }
    @Test
    public void testMethodAddAllIndex() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(1);
        test = test.add(100);
        test = test.add(110);
        test = test.addAll(0,new Integer [] {2, 3, 4});
        ImmutableList actualResult = test;
        assertEquals("2-->3-->4-->1-->100-->110-->", actualResult.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodAddAllIndex_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(100);
        test = test.add(247);
        test = test.add(7);
        test.add(4, 9);
    }
    @Test
    public void testMethodGet() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(10);
        test = test.add(222);
        test = test.addAll(new Integer []{4, 2, 3});
        Object actualResult = test.get(0);
        assertEquals(1, actualResult);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodGet_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(100);
        test = test.add(247);
        test = test.add(7);
        test.get(10);
    }
    @Test
    public void testMethodRemove() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(1);
        test = test.add(3);
        test = test.add(400);
        ImmutableList actualResult = test.remove(2);
        assertEquals("1-->3-->", actualResult.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodRemove_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(100);
        test = test.add(247);
        test = test.add(7);
        test.remove(10);
    }
    @Test
    public void testMethodSet() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(4);
        test = test.addAll(new Integer []{4, 2, 3});
        ImmutableList actualResult = test.set(0,100);
        assertEquals("100-->3-->4-->4-->2-->3-->", actualResult.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodSet_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(100);
        test = test.add(247);
        test = test.add(7);
        test.set(10, 1000);
    }
    @Test
    public void testMethodIndexOf() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(5);
        test = test.addAll(new Integer []{4, 2, 100});
        Object actualResult = test.indexOf(4);
        assertEquals(3, actualResult);
    }
    @Test
    public void testMethodIndexOf_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(5);
        test = test.addAll(new Integer []{4, 2, 100});
        Object actualResult = test.indexOf(10);
        assertEquals(-1, actualResult);
    }
    @Test
    public void testMethodSize() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(5);
        test = test.addAll(new Integer []{4, 2, 100});
        int actualResult = test.size();
        assertEquals(6, actualResult);
    }
    @Test
    public void testMethodSize_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(5);
        test = test.addAll(0, new Integer []{4, 2, 100});
        int actualResult = test.size();
        assertEquals(6, actualResult);
    }
    @Test
    public void testMethodClear() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(5);
        String  actualResult = test.clear().toString();
        assertEquals("is empty", actualResult);
    }
    @Test
    public void testMethodEmpty() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(5);
        test = test.clear();
        boolean actualResult = test.isEmpty();
        assertEquals(true, actualResult);
    }
    @Test
    public void testMethodEmpty_2() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(5);
        boolean actualResult = test.isEmpty();
        assertEquals(false, actualResult);
    }
    @Test
    public void testMethodToArray() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(0, 1);
        test = test.add(3);
        test = test.add(5);
        assertEquals(Arrays.toString(new Object []{1, 3, 5}), Arrays.toString(test.toArray()));
    }
    
}
