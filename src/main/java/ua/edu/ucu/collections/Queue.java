package ua.edu.ucu.collections;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {

    private ImmutableLinkedList linkedList;

    public Queue()
    {
        linkedList = new ImmutableLinkedList();
    }

    public Object peek(){
        return linkedList.getFirst();
    }

    public void enqueue(Object e)
    {
        linkedList = linkedList.addFirst(e);

    }

    public Object dequeue()
    {
        Object removedData = linkedList.getFirst();
        linkedList = linkedList.removeFirst();
        return removedData;
    }


    public String toString(){
        return linkedList.toString();
    }



}