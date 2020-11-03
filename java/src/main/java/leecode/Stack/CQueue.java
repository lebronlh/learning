package leecode.Stack;

import effectivejava.genertic.Stack;

/**
 * 用两个栈实现一个队列
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能，(若队列中没有元素，deleteHead 操作返回 -1 )
 */
public class CQueue {
    Stack<Integer> stack1;//支持插入操作
    Stack<Integer> stack2;//支持删除操作


    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //从尾部增加
    public void appendTail(int value) {
        stack1.push(value);
    }

    //从头部删除
    public int deleteHead() {

        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        if(stack2.isEmpty()){
            return -1;
        }else{
            return stack2.pop();
        }

    }

    //出队列

    public static void main(String[] args) {

    }
}
