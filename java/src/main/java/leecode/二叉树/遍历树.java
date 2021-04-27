package leecode.二叉树;

import org.junit.Test;

import java.util.*;

public class 遍历树 {

    //递归
    //先序遍历
    public void preOrder(TreeNode node){
        if(node==null)
            return;
        System.out.print(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
    //非递归实现
    public void preOrder2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            if(node != null) {
                System.out.print(node.val);
                stack.push(node);
                node = node.left;
            }else {
                node = stack.pop();
                node = node.right;
            }
        }

    }


    //中序遍历
    public void midOrder(TreeNode node){
        if (node==null)
            return;
        midOrder(node.left);
        System.out.print(node.val);
        midOrder(node.right);
    }
    //非递归
    public void midOrder2(TreeNode root){
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        while(stack.size()>0||root!=null){
            if(root!=null){
                stack.push(root);
                root= root.left;
            }else{
                TreeNode node = stack.pop();
                System.out.print(node.val);
                root = node.right;
            }
        }

    }

    //后续遍历
    public void afterOrder(TreeNode node){
        if(node == null)
            return;
        afterOrder(node.left);
        afterOrder(node.right);
        System.out.print(node.val);
    }

    public List<Integer> afterOrder2(TreeNode root){

        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return res;
        }

        while (root!=null||!stack.isEmpty()){
            while (root!=null){
                res.add(root.val);
                stack.push(root);
                root = root.right;
            }
            TreeNode node = stack.pop();
            root = node.left;
        }
        Collections.reverse(res);
        return res;

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
            System.out.print(treeNode.val);
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
        preOrder(root);
        System.out.println();
        preOrder2(root);
        System.out.println();
        //中序测试
        midOrder(root);
        System.out.println();
        midOrder2(root);
        System.out.println();
        //后序测试
        afterOrder(root);
        System.out.println();
        List<Integer> integers = afterOrder2(root);
        for (Integer integer : integers) {
            System.out.print(integer);
        }

        //bfsOrder(root);
        //dfsOrder(root);
    }
}
