package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testPop()
    {
        Stack new_stack = new Stack();
        new_stack.pop(10);
        new_stack.pop(34);
        new_stack.pop(1);
        assertEquals("10-->34-->1-->", new_stack.toString());
    }
    @Test
    public void testPeek()
    {
        Stack new_stack = new Stack();
        new_stack.pop(10);
        new_stack.pop(34);
        new_stack.pop(1);
        Object actualResult = new_stack.peek();
        assertEquals(1, actualResult);
    }
    @Test
    public void testPop_1()
    {
        Stack new_stack = new Stack();
        new_stack.pop(10);
        new_stack.pop(34);
        new_stack.pop(1);
        Object actualResult = new_stack.pop();
        assertEquals(1, actualResult);
    }
    


}
