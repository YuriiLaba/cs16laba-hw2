package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testEnqueue() {
        Queue new_queue = new Queue();
        new_queue.enqueue(10);
        new_queue.enqueue(4);
        new_queue.enqueue(65);
        new_queue.enqueue(12);
        assertEquals("10-->4-->65-->12-->", new_queue.toString());
    }
    @Test
    public void testPeek() {
        Queue new_queue = new Queue();
        new_queue.enqueue(10);
        new_queue.enqueue(4);
        new_queue.enqueue(65);
        new_queue.enqueue(12);
        Object actualResult = new_queue.peek();
        assertEquals(10, actualResult);
    }
    @Test
    public void testDequeue() {
        Queue new_queue = new Queue();
        new_queue.enqueue(10);
        new_queue.enqueue(4);
        new_queue.enqueue(65);
        new_queue.enqueue(12);
        Object actualResult = new_queue.dequeue();
        assertEquals(10, actualResult);
    }


}
