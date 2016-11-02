package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList {

    public Object head;

    public ImmutableLinkedList(Object head) {
        this.head = head;
    }

    public ImmutableList add(Object e){
        LinkedNode new_node = new LinkedNode(e, null, null);
        if (this.head == null){
            this.head = new_node;
        }else{
            new_node.next = this.head;
            new_node.previous = new_node;
            this.head = new_node;
    }ImmutableLinkedList lst = new ImmutableLinkedList(head);
        return lst;
    }




}
