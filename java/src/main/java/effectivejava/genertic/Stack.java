package effectivejava.genertic;

import lh.entry.AfterUser;
import lh.entry.User;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E> {

    private E[] elements;
    private int size;
    private  static  final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack(){
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
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
            return false;
    }

    public void pushAll(Iterable<E> src){
        for (E e : src) {
            push(e);
        }
    }

    public static void main(String[] args) {
        List<? extends User> list =new ArrayList<>();
        List< User> list3 =new ArrayList<>();
        List<? extends User> list1 =List.of(new User(),new User(),new AfterUser());
        List<User> list2 =List.of(new User(),new User(),new AfterUser());
        list3.add(new User());
        System.out.println(list1.getClass());
        System.out.println(list.getClass());

//        User u1 = new AfterUser();
//        list1.add(u1);



    }
}

