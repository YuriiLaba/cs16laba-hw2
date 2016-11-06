package ua.edu.ucu.collections.immutable;

/**
 * Created by jlaba on 03.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        //ImmutableLinkedList test = new ImmutableLinkedList();
        //test =  test.add(1);
        //test = test.add(2);
        //test = test.add(3);
        //test = test.add(4);
        //test = test.add(0,4);
        //test = test.addAll(1, new Object[]{46, 78, 43});
        //System.out.println(test.get(4));
        //test = test.remove(1);
        //test =test.set(3,10);
        //System.out.println(test.indexOf(3));
        //test = test.addFirst(99);
        //test = test.addLast(100);
        //test = test.removeFirst();
        //test = test.removeLast();
        //System.out.println(test.getFirst());
        //System.out.println(test.getLast());
        //test = test.clear();
        //test.toArray();
        //System.out.println(test.toString());
        //Queue test_queue = new Queue();
        //test_queue.enqueue(2);
        //test_queue.enqueue(3);
        //test_queue.enqueue(4);
        //System.out.println(test_queue.dequeue());
        //System.out.println(test_queue.peek());
        //System.out.println(test_queue.toString());
        //Stack test_stack = new Stack();
        //test_stack.pop(3);
        //test_stack.pop(4);
        //test_stack.pop(5);
        //test_stack.pop(6);
        //System.out.println(test_stack.pop());
        //System.out.println(test_stack.peek());
        //System.out.println(test_stack.toString());
        ImmutableArrayList test_array = new ImmutableArrayList(new Object[] {1,2,3,5,7});
        //System.out.println(test_array.remove(4));
        //System.out.println(test_array.set(0,100));
        //System.out.println(test_array.indexOf(1));
        //System.out.println(test_array.size());
        //System.out.println(test_array.toString());
        //test_array.clear();
        //System.out.println(test_array.add(100));
        //System.out.println(test_array.remove(2));
        //System.out.println(test_array.add(4,100));
        //System.out.println(test_array.toString());
        //System.out.println(test_array.addAll(new Object[]{100,200,300}));
        System.out.println(test_array.addAll(0, new Object[]{100, 400,455, 600}));

    }
}
