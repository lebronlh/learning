package leecode.二叉树;

public class 重建二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        return recur(preorder,0,len-1,inorder,0,len-1);
    }

    public TreeNode recur(int[] preorder,int l1,int r1,int[] inorder,int l2,int r2){
        if(l1>r1||l2>r2)
            return null;
        int i =l2;
        while (inorder[i]!=preorder[l1]){
            i++;
        }
        TreeNode root = new TreeNode(preorder[l1]);
        root.left = recur(preorder,l1+1,l1+i-l2,inorder,l2,i-1);
        root.right = recur(preorder,l1-l2+i+1,r1,inorder,i+1,r2);

        return root;
    }
}
