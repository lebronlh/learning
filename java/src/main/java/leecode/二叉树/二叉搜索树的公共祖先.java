package leecode.二叉树;


import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class 二叉搜索树的公共祖先 {


    /**
     * 大佬解法，一次遍历
     * public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     *         TreeNode ancestor = root;
     *         while (true) {
     *             if (p.val < ancestor.val && q.val < ancestor.val) {
     *                 ancestor = ancestor.left;
     *             } else if (p.val > ancestor.val && q.val > ancestor.val) {
     *                 ancestor = ancestor.right;
     *             } else {
     *                 break;
     *             }
     *         }
     *         return ancestor;
     *     }
     *
     *
     *
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        List<TreeNode> qlist = path(root,p);
        List<TreeNode> plist = path(root,q);


        //遍历两个链表找到最后一个相同的元素
        for(int i=qlist.size()-1;i>=0;i--){
            for(int j =plist.size()-1;j>=0;j--){
                if(plist.get(j).val==qlist.get(i).val)
                    return qlist.get(i);
            }
        }

        return null;




    }


    /**
     * 寻找节点p的路径
     * @param root
     * @param p
     * @return
     */
    public List<TreeNode> path(TreeNode root,TreeNode p) {
        //dfs用栈
        Stack<TreeNode> stack = new Stack<>();
        List<TreeNode> list = new LinkedList<>();
        if(root!= null)
            stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node);

            if(p.val==node.val)
                return list;
            else if (p.val > node.val)
                stack.push(node.right);
            else
                stack.push(node.left);

        }
        throw new RuntimeException("没有"+p.val+"节点");
    }

    @Test
    public void test(){
        int a[] = {6,2,8,0,4,7,9};
        TreeNode root = 创建二叉树.createBinTree(a, 0);
       lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8));

    }
}
