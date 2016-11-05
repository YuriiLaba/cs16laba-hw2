package ua.edu.ucu.collections;

public class Stack {
    private class StackNode {
        private Object data;
        private StackNode next;

        public StackNode getNext() {
            return next;
        }

        public void setNext(StackNode next) {
            this.next = next;

        }

        public StackNode(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return data;
        }
    }
    private StackNode top;



    public Stack() {
        this.top = null;
    }

    public void pop(Object e){
        StackNode node = new StackNode(e);
        if(top == null){
            top = node;
        }else{
            node.setNext(top);
            top = node;
        }

    }

    public Object pop(){
        Object result = top.getData();
        top = top.getNext();
        return result;
    }
    public Object peek(){
        return top.getData();
    }

    public String toString(){
        String str = "";
        while ((top != null)){
            str += top.getData().toString() + "-->";
            top = top.next;
        }
        return str;}
}
