package leecode.二叉树;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 遍历树 {

    //递归
    //先序遍历
    public void preOrder(TreeNode node){
        if(node==null)
            return;
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    //中序遍历
    public void midOrder(TreeNode node){
        if (node==null)
            return;
        midOrder(node.left);
        System.out.println(node.val);
        midOrder(node.right);
    }

    //后续遍历
    public void afterOrder(TreeNode node){
        if(node == null)
            return;
        afterOrder(node.right);
        afterOrder(node.left);
        System.out.println(node.val);
    }

    //BFS
    public void bfsOrder(TreeNode node) {
        //BFS一层一层的遍历,用队列
        Queue<TreeNode> queue = new LinkedList<>();
        //首先添加根节点
        if (node != null)
            queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            System.out.println(treeNode.val);
            if (treeNode.left != null)
                queue.add(treeNode.left);
            if (treeNode.right != null)
                queue.add(treeNode.right);
        }
    }


        //DFS
    public void dfsOrder(TreeNode node){
        /*dfs就是从顶向下访问
        * 两种方案
        * 递归和栈*/

    /*  //递归
        if (node == null)
            return;
        //在这里处理遍历到的TreeNode节点
        if (node.left != null)
            dfsOrder(node.left);
        if (node.right != null)
            dfsOrder(node.right);
            */
    //栈
        Stack<TreeNode> stack =new Stack<>();
        if(node!=null)
            stack.push(node);
        while (!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            System.out.println(treeNode.val);
            if(treeNode.right!=null)
                stack.push(treeNode.right);

            if(treeNode.left!=null)
                stack.push(treeNode.left);
        }


    }





    @Test
    public  void test() {

        int a[] ={1,5,6,7,8,10,2,3};
        TreeNode root = 创建二叉树.createBinTree(a, 0);
        //先序测试
        //preOrder(root);
        //中序测试
        //midOrder(root);
        //后序测试
        //afterOrder(root);
        //bfsOrder(root);
        dfsOrder(root);
    }
}
