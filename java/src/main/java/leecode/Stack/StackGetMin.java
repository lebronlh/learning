package leecode;

import effectivejava.genertic.Stack;

/**
 * 要求在栈的压栈和出栈基础功能上，再加上获取最小值的功能
 */
public class StackGetMin {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;



    @SuppressWarnings("unchecked")
    public StackGetMin(int initiaSize) {
            if(initiaSize<0)
                throw  new RuntimeException("初始值不能小于0");
            else{
                stackData = new Stack(initiaSize);
                stackData = new Stack(initiaSize);
            }


    }

    public void push(int newData){
        if (stackData.isEmpty())
            stackData.push(newData);

        if(stackMin.isEmpty())
            stackMin.push(newData);

    }

   /* private int pop(){
        if(stackData[top]>stackMin[])
        return 0;
    }*/

    public static void main(String[] args) {


    }
}
