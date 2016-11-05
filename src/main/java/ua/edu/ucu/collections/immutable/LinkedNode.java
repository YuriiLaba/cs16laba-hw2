package ua.edu.ucu.collections.immutable;

/**
 * Created by jlaba on 02.11.2016.
 */
public class LinkedNode implements Cloneable {
    public final Object data;
    public LinkedNode next = null;


    public LinkedNode(Object data) {
        this.data = data;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public LinkedNode getNext() {
        return next;
    }

    public LinkedNode clone() {
        return new LinkedNode(data);
    }
    public String toString(){
        return getData().toString();
    }
}
