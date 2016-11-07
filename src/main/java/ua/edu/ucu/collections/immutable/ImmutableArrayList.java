package ua.edu.ucu.collections.immutable;


public class ImmutableArrayList implements ImmutableList {
    private final Object[] elements;
    private int size = 0;

    public ImmutableArrayList() {
        this.elements = new Object[0];
    }

    public ImmutableArrayList(Object[] elements, int size) {
        this.size = size;
        this.elements = elements;
    }

    @Override
    public ImmutableArrayList add(Object e){
        Object[] newList = new Object[size+1];
        for(int i = 0; i < size; i++){
            newList[i] = elements[i];
        }
        newList[size] = e;
        size++;
        return new ImmutableArrayList(newList, size);
    }

    public ImmutableList add(int index, Object e) {
        Object[] newList = new Object[size()+1];
        for(int i = 0; i<size; i++){
            if(i != index){
                newList[i] = elements[i];
            }

            else{
                newList[i] = e;
                for(int a = index; a<size; a++){
                    newList[a+1] = elements[a];
                }return new ImmutableArrayList(newList, size);

            }
        }return new ImmutableArrayList(newList, size);

    }

    public ImmutableList addAll(Object[] c) {

        Object[] newList = new Object[size()+c.length];
        for(int i = 0; i<size(); i++){
            newList[i] = elements[i];
        } for(int a = 0; a<c.length; a++){
            newList[size()] = c[a];
            size++;
        }

        return new ImmutableArrayList(newList, size);
    }

    public ImmutableList addAll(int index, Object[] c) {
        Object[] newList = new Object[size()+c.length];
        int temp_index = index;
        for(int i = 0; i<index; i++){
            newList[i] = elements[i];}
        for(int a = 0; a<c.length; a++){
            newList[temp_index] = c[a];
            temp_index++;}
        for(int b = index; b<size(); b++){
            newList[index+c.length] = elements[b];
        index++;}
        size += c.length;


        return new ImmutableArrayList(newList, size);
    }

    public Object get(int index) {
        if(index>size){
            throw new IndexOutOfBoundsException();
        }else{
        return elements[index];}
    }

    public ImmutableList remove(int index){
        if((index<0) || index >= size()){
            throw new IndexOutOfBoundsException();
        }else{
            Object[] newList = new Object[size()-1];
        //System.out.println(size());
            for(int i = 0; i < size(); i++){
                if(i < index){
                    newList[i] = elements[i];
                }
                else if(i>index){
                    newList[i-1] = elements[i];
                }

            }
            size--;
            return new ImmutableArrayList(newList, size);

        }
    }

    public ImmutableList set(int index, Object e){
        if((index<0) || index >= size()){
            throw new  IndexOutOfBoundsException();
        }else{
            Object[] newList = new Object[size()];
            for(int i = 0; i < size(); i++){
                if(i == index){
                    newList[index] = e;
                }else {
                newList[i] = elements[i];
                }
            }


            return new ImmutableArrayList(newList, size);
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
        return size;

    }

    public ImmutableList clear(){
        Object[] newList = new Object[size()+1];
        for(int i = 0; i<size; i++){
            newList[i] = null;}
        size = 0;
        return new ImmutableArrayList(newList, size);

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
        }return null;
    }

        public String toString(){
            String str = "";
            for(int i = 0; i < size(); i++){
                str += elements[i];
                str += "--";
            }return str;
    }


    }

