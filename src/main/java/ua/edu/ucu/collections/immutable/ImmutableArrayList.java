package ua.edu.ucu.collections.immutable;


import java.util.Arrays;

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

    public ImmutableArrayList add(int index, Object e) {
        if((index<0) || index > size()){
            throw new IndexOutOfBoundsException();
        } else {
        Object[] newList = new Object[size()+1];
        for(int i = 0; i<size+1; i++){
            if(i != index){
                newList[i] = elements[i];
            }

            else{
                newList[i] = e;
                int a = index;
                while (a<size) {
                    newList[a+1] = elements[a];
                    a++;
                }break;
            }

        }size++;
        return new ImmutableArrayList(newList, size);

    }
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
        if((index<0) || index >= size()){
            throw new IndexOutOfBoundsException();
        } else {
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
    }

    public Object get(int index) {
        if((index<0) || index >= size()){
            throw new IndexOutOfBoundsException();
        } else{
        return elements[index];
        }
    }

    public ImmutableList remove(int index) {
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

    public ImmutableList set(int index, Object e) {
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

    public int indexOf(Object e) {
        for (int i = 0; i < size(); i++){
            if(e == elements[i]){
                return i;
            }
        }return -1;
    }

    public int size(){
        return size;

    }

    @Override
    public ImmutableList clear() {
        Object [] clearedList = new Object[0];
        size = 0;
        return new ImmutableArrayList(clearedList,size);
    }

    public boolean isEmpty() {
        if (this.size()>0){
            return false;
        }else{
            return true;
        }
    }

    public Object[] toArray() {
        Object[] list = new Object[size];
        int i = 0;
        while (i != size){
            list[i] = elements[i];
            i++;
        }

        return list;
    }

        public String toString() {
            String str = "";
            if(size == 0){
                str += "is empty";
            }else{

                for(int i = 0; i < size(); i++){
                //System.out.println(Arrays.toString(elements));
                str += elements[i];
                str += "-->";}
            }return str;
    }

}


