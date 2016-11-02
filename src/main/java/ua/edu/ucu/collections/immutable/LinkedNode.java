package ua.edu.ucu.collections.immutable;

/**
 * Created by jlaba on 02.11.2016.
 */
public class LinkedNode {
    public Object data;
    public Object next = null;
    public Object previous = null;

    public LinkedNode(Object data, Object next, Object previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Object getData() {
        return data;
    }

    public Object getNext() {
        return next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }
}
