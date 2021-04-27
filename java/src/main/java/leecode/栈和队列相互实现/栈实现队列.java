package leecode.栈和队列相互实现;

import java.util.Stack;

public class 栈实现队列 {
    /**
     * 双栈实现队列 stack A，stack B
     * 入队列操作：
     *
     */
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public 栈实现队列() {
        stack1= new Stack<>();
        stack2= new Stack<>();
    }

    public int push(int x){
        stack1.push(x);
        return  x;
    }

    public int poll(){

        if(!stack2.isEmpty())
            return stack2.pop();

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        if(!stack2.isEmpty())
            return stack2.pop();
        else
            return -1;


    }
}
