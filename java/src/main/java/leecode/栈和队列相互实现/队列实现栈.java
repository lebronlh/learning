package leecode.栈和队列相互实现;

import java.util.LinkedList;
import java.util.Queue;

public class 队列实现栈 {
    //用一个队列实现栈
    /**
     * 入栈操作：如果队列为空，则直接add；
     * 否则先把队列里的元素以此出队列，在add新元素后再入队列。则能实现队列头即是刚入栈的元素，队列尾是栈尾。
     *
     * 出栈操作直接溢出队列的前端元素返回即可
     */


    //用两个队列
    /**
     * 两个队列queue1，queue2
     * 以queue为主，入栈时先放到queue2，然后queue1的全部出队列到queue2,然后queue1和queue2交换
     */
    class StackQueue{
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        public StackQueue(Queue<Integer> queue1, Queue<Integer> queue2) {
            this.queue1 = queue1;
            this.queue2 = queue2;
        }

        public int push(Integer element){
             queue2.add(element);
             while (!queue1.isEmpty())
                 queue2.add(queue1.poll());
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return element;
        }

        public int pop(){
             return queue1.poll();
        }

        public int top(){
            return queue1.peek();
        }

        public boolean isEmpty(){
            return queue1.isEmpty();
        }
    }
}
