package ua.edu.ucu.collections;



public class Queue {
    private class Node {
        private Object data;
        private Node next;

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;

        }

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;


    public Queue() {
        this.front = null;
        this.rear = null;

    }

    public void enqueue (Object e)
    {
        Node node = new Node(e);
        if (front == null)
            front = node;
        else
            rear.setNext (node);

        rear = node;
    }
    public Object dequeue(){
        Object result = front.getData();
        front = front.getNext();
        return result;
    }
    public Object peek(){
        return front.getData();
    }

    public String toString(){
        String str = "";
        while ((front != null)){
            str += front.getData().toString() + "<--";
            front = front.next;
        }
        return str;

}}


