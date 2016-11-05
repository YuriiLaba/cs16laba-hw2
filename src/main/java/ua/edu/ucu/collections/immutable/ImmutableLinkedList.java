package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList {
    public LinkedNode head;
    private int size;

    public ImmutableLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public ImmutableLinkedList add(Object e) {
        if(size == 0){
            LinkedNode node_current = new LinkedNode(e);
            size += 1;
            this.head = node_current;
            return return_new_list(node_current);
        }
        else{

            LinkedNode new_head = cloneLinkedList();
            LinkedNode node_current = new_head;
            while(node_current.next != null){
                node_current = node_current.next;
            }
            node_current.next = new LinkedNode(e);
            size += 1;
            return return_new_list(new_head);
            }
        }

    public ImmutableLinkedList return_new_list(LinkedNode e){
        ImmutableLinkedList newList = new ImmutableLinkedList();
        newList.head = e;

        LinkedNode currentNode = newList.head;

        while (currentNode != null){
            newList.size += 1;
            currentNode = currentNode.next;

        }
        return newList;
    }

    public LinkedNode cloneLinkedList(){
        if(head != null){
            LinkedNode current_node = head;
            LinkedNode clone_head = new LinkedNode(current_node.getData());
            LinkedNode current_node_clone = clone_head;
            while(current_node.next != null){
                current_node = current_node.next;
                current_node_clone.next = current_node.clone();
                current_node_clone = current_node_clone.next;
            }
            //System.out.println(clone_head);
            return clone_head;
    }return null;
    }

    @Override
    public ImmutableLinkedList add(int index, Object e) {
        if(index>size){
            throw new IndexOutOfBoundsException();
        }else{
        int i = 0;
        LinkedNode realFirstCopiedList = cloneLinkedList();
        LinkedNode firstCopiedList = realFirstCopiedList;
        LinkedNode secondCopiedList = cloneLinkedList();

        if(index == 0){
            LinkedNode Node = new LinkedNode(e);

            LinkedNode real_head = Node;
            real_head.next = realFirstCopiedList;
            real_head = real_head.next;
            while( realFirstCopiedList.next != null){
                realFirstCopiedList = realFirstCopiedList.next;
                real_head.next = realFirstCopiedList;
                real_head = real_head.next;}
            size ++;
            return return_new_list(Node);
        }

        while (i<size){
            if(i<index-1){
                firstCopiedList = firstCopiedList.next;
                secondCopiedList = secondCopiedList.next;

            }else if(i==index-1){
                firstCopiedList.next = new LinkedNode(e);
                //System.out.println(firstCopiedList.next);
                firstCopiedList = firstCopiedList.next;
                //System.out.println(firstCopiedList.next);

                //return return_new_list(firstCopiedList);

            }else{
                firstCopiedList.next = secondCopiedList.next;
                //System.out.println(firstCopiedList.next);
                firstCopiedList = firstCopiedList.next;
                secondCopiedList = secondCopiedList.next;
            }
            i++;

    }size++;
        return return_new_list(realFirstCopiedList);
    }}


    @Override
    public ImmutableLinkedList addAll(Object[] c) {
        LinkedNode realFirstCopiedList = cloneLinkedList();
        LinkedNode firstCopiedList = realFirstCopiedList;

        while(firstCopiedList.next != null){
            firstCopiedList = firstCopiedList.next;
        }for(int i = 0; i < c.length; i++){
            firstCopiedList.next = new LinkedNode(c[i]);
            firstCopiedList = firstCopiedList.next;
        }
        size++;

        return return_new_list(realFirstCopiedList);
    }

    @Override
    public ImmutableLinkedList addAll(int index, Object[] c) {
        if(index>size){
            throw new IndexOutOfBoundsException();
        }else{
        LinkedNode realFirstCopiedList = cloneLinkedList();
        LinkedNode firstCopiedList = realFirstCopiedList;
        LinkedNode secondCopiedList = cloneLinkedList();
        int i = 0;
        if(index == 0){
            LinkedNode real_new_head = new LinkedNode(c[0]);
            LinkedNode real_head = real_new_head;

            for(int p = 1; p < c.length; p++){
                real_head.next = new LinkedNode(c[p]);
                real_head = real_head.next;
            }
            while (firstCopiedList.next != null ){
                real_head.next = firstCopiedList;
                firstCopiedList = firstCopiedList.next;
                real_head = real_head.next;
            }
            size += c.length;
            return return_new_list(real_new_head);

        }

        while (i<size){
            if(i<index-1){
                firstCopiedList = firstCopiedList.next;
                secondCopiedList = secondCopiedList.next;}
            else if(i == index-1){
                for(int a = 0; a<c.length; a++){
                    firstCopiedList.next = new LinkedNode(c[a]);
                    firstCopiedList = firstCopiedList.next;
                }

            }else{
                firstCopiedList.next = secondCopiedList.next;
                firstCopiedList = firstCopiedList.next;
                secondCopiedList = secondCopiedList.next;
            }

            i++;
        }size += c.length;

        return return_new_list(realFirstCopiedList);
    }}

    @Override
    public Object get(int index) {
        if(index > size){
            throw new IndexOutOfBoundsException();
        }else{
        int i = 0;

        LinkedNode firstCopiedList = cloneLinkedList();

        while(i != index){
            firstCopiedList = firstCopiedList.next;
            i++;
        }return firstCopiedList.getData();

    }
    }

    @Override
    public ImmutableLinkedList remove(int index) {

        if(index >= size){
            throw new IndexOutOfBoundsException();
        }else{
        int i =0;
        LinkedNode realFirstCopiedList = cloneLinkedList();
        LinkedNode firstCopiedList = realFirstCopiedList;
        LinkedNode secondCopiedList = cloneLinkedList();

        if(index == 0){
            LinkedNode real_head = realFirstCopiedList.next;
            size --;
            return return_new_list(real_head);
        }else{
        while(i < size){
            if (i<index-1){
                firstCopiedList = firstCopiedList.next;
                secondCopiedList = secondCopiedList.next;

            }else if(i == index-1){
                firstCopiedList.next = secondCopiedList;
                secondCopiedList = secondCopiedList.next;
            }else{
                firstCopiedList.next = secondCopiedList.next;
                firstCopiedList = firstCopiedList.next;
                secondCopiedList = secondCopiedList.next;
                }

            i++;

        }size --;
        return return_new_list(realFirstCopiedList);

    }}}

    @Override
    public ImmutableLinkedList set(int index, Object e) {
        if(index >= size){
            throw new IndexOutOfBoundsException();}
        else{
        LinkedNode copied_list = cloneLinkedList();
        LinkedNode real_copied_list = copied_list;
        int i = 0;
        while (real_copied_list != null) {
            if (index == i) {
                ImmutableLinkedList list_without_removed_element = this.remove(i);
                ImmutableLinkedList list_with_added_element = list_without_removed_element.add(i, e);
                LinkedNode final_list = list_with_added_element.cloneLinkedList();
                return return_new_list(final_list);
            }
            real_copied_list = real_copied_list.next;
            i++;
        }
        return return_new_list(copied_list);
    }}

    @Override
    public int indexOf(Object e) {
        int i = 0;
        LinkedNode firstCopiedList = cloneLinkedList();
        while(i != size){
            if(firstCopiedList.getData() == e)
                return i;
            firstCopiedList = firstCopiedList.next;
            i++;
        }return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ImmutableLinkedList clear() {
        LinkedNode realFirstCopiedList = cloneLinkedList();
        int i = 0;
        while (i < size){
            realFirstCopiedList = null;
            i++;
        }return return_new_list(realFirstCopiedList);
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }return false;

    }

    @Override
    public Object[] toArray() {
        LinkedNode real_copied_list = cloneLinkedList();
        Object[] list = new Object[size];
        int i = 0;
        while (i != size){
            list[i] = real_copied_list.getData();
            real_copied_list = real_copied_list.next;
            i++;
        }

        return list;
    }

    public String toString(){
        String str = "";
        LinkedNode start = head;
        while ((start != null)){
            str += start.getData().toString() + "-->";
            start = start.next;
        }
        return str;
    }
    public ImmutableLinkedList addFirst(Object e) {
        LinkedNode realFirstCopiedList = cloneLinkedList();
        LinkedNode Node = new LinkedNode(e);
        LinkedNode real_head = Node;
        real_head.next = realFirstCopiedList;
        real_head = real_head.next;
        while( realFirstCopiedList.next != null){
            realFirstCopiedList = realFirstCopiedList.next;
            real_head.next = realFirstCopiedList;
            real_head = real_head.next;}
        size ++;
        return return_new_list(Node);

    }public ImmutableLinkedList addLast(Object e){
        LinkedNode realFirstCopiedList = cloneLinkedList();
        LinkedNode real_head = realFirstCopiedList;

        while( real_head.next != null){
            real_head = real_head.next;}
        real_head.next = new LinkedNode(e);
        size++;
        return return_new_list(realFirstCopiedList);
    }
    public ImmutableLinkedList removeFirst(){
        LinkedNode realFirstCopiedList = cloneLinkedList();
        LinkedNode real_head = realFirstCopiedList.next;
        size --;
        return return_new_list(real_head);

    }public ImmutableLinkedList removeLast() {
        LinkedNode realFirstCopiedList = cloneLinkedList();
        LinkedNode real_head = realFirstCopiedList;
        while (real_head.next.next != null) {
            real_head = real_head.next;
    }size--;
    real_head.next = null;
    return return_new_list(realFirstCopiedList);
    }
    public Object getFirst(){
        LinkedNode firstCopiedList = cloneLinkedList();
        return firstCopiedList.getData();
    }public Object getLast(){
        LinkedNode firstCopiedList = cloneLinkedList();
        while(firstCopiedList.next != null){
            firstCopiedList = firstCopiedList.next;
        }
        return firstCopiedList.getData();
    }

}


