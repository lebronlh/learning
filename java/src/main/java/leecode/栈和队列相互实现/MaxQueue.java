package leecode.栈和队列相互实现;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
    Deque<Integer> d;
    Queue<Integer> q;

    public MaxQueue() {
        d = new LinkedList();
        q = new LinkedList();
    }

    public int max_value() {
        if(d.isEmpty()){
            return -1;
        }

        return  d.peekFirst();
    }

    public void push_back(int value) {
        q.offer(value);
        while(!d.isEmpty()&&d.peekLast()<value)
            d.pollLast();
        d.offer(value);
    }

    public int pop_front() {
        if(q.isEmpty())
            return -1;
        if(q.peek().equals(d.peekFirst()))
            d.pollFirst();
        return q.poll();
    }


}
