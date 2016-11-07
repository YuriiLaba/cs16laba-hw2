package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {

    private ImmutableLinkedList linkedList1;
    public Stack()
    {

        linkedList1 = new ImmutableLinkedList();
    }

    public Object peek(){
        return linkedList1.getLast();
    }
    public void pop(Object e)
    {
        linkedList1 = linkedList1.addFirst(e);

    }
    public Object pop()
    {
        Object removedData = linkedList1.getLast();
        linkedList1 = linkedList1.removeLast();
        return removedData;
    }
    public String toString(){
        return linkedList1.toString();
    }

}
