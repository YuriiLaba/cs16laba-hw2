package ua.edu.ucu.collections.immutable;

public class ImmutableArrayList implements ImmutableList {
    private final Object[] elements;

    public ImmutableArrayList(Object[] elements) {
        this.elements = elements;
    }

    ImmutableList add(int index, Object e); //додає елемент до колекції за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    ImmutableList addAll(Object[] c); //додає масив елементів у кінець колекції

    ImmutableList addAll(int index, Object[] c); // додає масив елементів починаючи з зазначеного індекса, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    Object get(int index); //повертає елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableList remove(int index) throws IndexOutOfBoundsException{
        if((index<0) || index >= size()){
            throw new IndexOutOfBoundsException();
        }else{
            Object[] list = this.toArray();
            Object[] newList = new Object[size() -1 ];
            for(int i = 0; i < size(); i++){
                if(i < index){
                    newList[i] = list[i];
                }else if(i>index){
                    newList[i] = list[i-1];
                }
            }ImmutableArrayList removeList = new ImmutableArrayList(newList);
            return removeList;

        }


    }

    public ImmutableList set(int index, Object e) throws IndexOutOfBoundsException{
        if((index<0) || index >= size()){
            throw new  IndexOutOfBoundsException();
        }else{
            Object[] list = this.toArray();
            list[index] = e;
            ImmutableArrayList setList = new ImmutableArrayList(list);
            return setList;
        }

    }

    public int indexOf(Object e){
        for (int i = 0; i < size(); i++){
            if(e == elements[i]){
                return i;
            }
        }return -1;
    }

    public int size(){
        return elements.length;

    }

    public ImmutableList clear(){
        ImmutableArrayList cleared = new ImmutableArrayList(null);
        return this;

    }

    public boolean isEmpty(){
        if (this.size()>0){
            return false;
        }else{
            return true;
        }
    }

    public Object[] toArray(){
        Object[] list = new Object[this.size() + 1];
        for (int i =0; i <this.size(); i++){
            list[i] = this.get(i);
            return list;
        }

        @Override
        String toString(); //повертає рядок, де через кому відображаютсься елементи колекції


    }
    
}
