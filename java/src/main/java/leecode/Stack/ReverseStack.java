package leecode.Stack;


import java.util.Stack;

public class ReverseStack {
    /**
     * 用递归逆序一个栈
     */
    //两个递归方法
    //1、获取并移除栈中最后一个元素
    public static int getAndRemoveLast(Stack<Integer> stack){
        int i = stack.pop();
        if(stack.isEmpty())
            return i;
        else {
            int last = getAndRemoveLast(stack);
            stack.push(i);
            return last;
        }
    }

    //2、逆序栈
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int newNode = getAndRemoveLast(stack);
        reverse(stack);
        stack.push(newNode);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        /*while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            System.out.println(pop);
        }*/
        reverse(stack);
        System.out.println("-----------");
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            System.out.println(pop);
        }
    }
}
