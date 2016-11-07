package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testMethodAdd() {
        ImmutableLinkedList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        ImmutableList actualResult = test;
        assertEquals("100-->200-->300-->", actualResult.toString());
    }
    @Test
    public void testMethodAdd_2() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        ImmutableList second = test.add(400);
        second = second.add(500);
        ImmutableList actualResult = second;
        assertEquals("100-->200-->300-->400-->500-->", actualResult.toString());
    }
    @Test
    public void testMethodAddIndex() {
        ImmutableLinkedList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        test = test.add(0, 765);
        ImmutableList actualResult = test;
        assertEquals("765-->100-->200-->300-->", actualResult.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodIndex_2() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        test.add(5, 890);
    }
    @Test
    public void testMethodAddAll() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        test = test.addAll(new Object[]{999,888,777});
        ImmutableList actualResult = test;
        assertEquals("100-->200-->300-->999-->888-->777-->", actualResult.toString());
    }
    @Test
    public void testMethodAddAll_2() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        ImmutableList second = test.addAll(new Object[]{999,888,777});
        second = second.add(500);
        ImmutableList actualResult = second;
        assertEquals("100-->200-->300-->999-->888-->777-->500-->", actualResult.toString());
    }
    @Test
    public void testMethodAddAllIndex() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        test = test.addAll(0, new Object[]{999,888,777});

        ImmutableList actualResult = test;
        assertEquals("999-->888-->777-->100-->200-->300-->", actualResult.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodAddAllIndex_2() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        test.addAll(5, new Object[]{999,888,777});
    }
    @Test
    public void testMethodGet() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(405);
        ImmutableList second = test.add(55);
        second = second.add(100);
        Object actualResult = second.get(0);
        assertEquals(405 , actualResult);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodGet_2() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        test.get(4);
    }
    @Test
    public void testMethodRemove() {
        ImmutableList test = new ImmutableLinkedList();
        ImmutableList second = test.add(200);
        second = second.add(332);
        second = second.add(654);
        second = second.add("r");
        Object actualResult = second.remove(3);
        assertEquals("200-->332-->654-->", actualResult.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodRemove_2() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(100);
        test = test.add(200);
        test = test.add(300);
        test.remove(7);
    }
    @Test
    public void testMethodSet() {
        ImmutableList test9 = new ImmutableLinkedList();
        ImmutableList second = test9.add(200);
        second = second.add(332);
        second = second.add(654);
        second = second.add("r");
        Object actualResult = second.set(3, 1000);
        assertEquals("200-->332-->654-->1000-->", actualResult.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethodSet_2() {
        ImmutableList test8 = new ImmutableLinkedList();
        test8 = test8.add(100);
        test8 = test8.add(200);
        test8 = test8.add(300);
        test8.set(100, 5);
    }
    @Test
    public void testMethodIndexOf() {
        ImmutableList test = new ImmutableLinkedList();
        ImmutableList second = test.add(200);
        second = second.add(332);
        second = second.add(654);
        second = second.add("r");
        Object actualResult = second.indexOf("r");
        assertEquals(3, actualResult);
    }
    @Test
    public void testMethodIndexOf_2() {
        ImmutableList test9 = new ImmutableLinkedList();
        ImmutableList second = test9.add(200);
        second = second.add(332);
        second = second.add(654);
        second = second.add("r");
        Object actualResult = second.indexOf(1000);
        assertEquals(-1, actualResult);
    }
    @Test
    public void testMethodSize() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(1000);
        test = test.add(654);
        test = test.add(923);
        Object actualResult = test.size();
        assertEquals(3, actualResult);
    }
    @Test
    public void testMethodSize_2() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(1000);
        test = test.add(654);
        test = test.add(923);
        test = test.remove(0);
        Object actualResult = test.size();
        assertEquals(2, actualResult);
    }
    @Test
    public void testMethodClear() {
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(20);
        test = test.add(89);
        test = test.add(40);
        Object actualResult = test.clear();
        assertEquals("", actualResult.toString());
    }
    @Test
    public  void testMethodEmpty(){
        ImmutableList test = new ImmutableLinkedList();
        boolean actualResult = test.isEmpty();
        assertEquals(true, actualResult);
    }
    @Test
    public  void testMethodEmpty_2(){
        ImmutableList test = new ImmutableLinkedList();
        test = test.add(10);
        boolean actualResult = test.isEmpty();
        assertEquals(false, actualResult);
    }
    @Test
    public  void testMethodToArray(){
        ImmutableList test= new ImmutableLinkedList();
        test = test.add(2);
        test = test.add(3);
        Object [] actualResult = test.toArray();
        Object [] expected = {2, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(actualResult));
    }
    @Test
    public void testAddFirst(){
        ImmutableLinkedList test = new ImmutableLinkedList();
        test = test.add(2);
        test = test.add(100);
        test = test.add(1,3);
        test = test.addAll(new Object[]{1,56,40});
        test = test.addFirst("J");
        assertEquals("J-->2-->3-->100-->1-->56-->40-->", test.toString());
    }
    @Test
    public void testAddLast(){
        ImmutableLinkedList test = new ImmutableLinkedList();
        test = test.add(2);
        test = test.add(100);
        test = test.add(1,3);
        test = test.addAll(new Object[]{1,56,40});
        test = test.addLast("J");
        assertEquals("2-->3-->100-->1-->56-->40-->J-->", test.toString());
    }
    @Test
    public void removeFirst(){
        ImmutableLinkedList test = new ImmutableLinkedList();
        test = test.add(2);
        test = test.add(100);
        test = test.add(1,3);
        test = test.removeFirst();
        assertEquals("3-->100-->", test.toString());
    }
    @Test
    public void removeLast(){
        ImmutableLinkedList test = new ImmutableLinkedList();
        test = test.add(2);
        test = test.add(100);
        test = test.add(1,3);
        test = test.removeLast();
        assertEquals("2-->3-->", test.toString());
    }
    @Test
    public void getFirst(){
        ImmutableLinkedList test = new ImmutableLinkedList();
        test = test.add(2);
        test = test.add(100);
        test = test.add(3);
        Object actualResult = test.getFirst();
        Object expected = "2";
        assertEquals(actualResult.toString(), expected.toString());
    }
    @Test
    public void getLast(){
        ImmutableLinkedList test = new ImmutableLinkedList();
        test = test.add(2);
        test = test.add(100);
        test = test.add(3);
        Object actualResult = test.getLast();
        Object expected = "3";
        assertEquals(actualResult.toString(), expected.toString());
    }
}