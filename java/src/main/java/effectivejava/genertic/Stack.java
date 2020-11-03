package effectivejava.genertic;

import java.util.EmptyStackException;

public class Stack<E> {

    private E[] elements;
    private int size = 0;
    private  static  final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack(){
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public Stack(int init){
        elements = (E[]) new Object[init];
    }

    public void push(E e){
        elements[size++] = e;
    }

    public E pop(){
        if(size == 0)
            throw new EmptyStackException();
        E result = elements[size--];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty(){

        return size == 0 ? true:false;
    }

    public void pushAll(Iterable<E> src){
        for (E e : src) {
            push(e);
        }
    }

    public E peek(){
        if(size ==0){
            throw new RuntimeException();
        }
        return elements[size-1];
    }


    public static void main(String[] args) {
        Stack s=new Stack();
        System.out.println(s.size);

//        User u1 = new AfterUser();
//        list1.add(u1);



    }
}

