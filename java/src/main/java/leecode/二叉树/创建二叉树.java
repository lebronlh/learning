package leecode.二叉树;

public class 创建二叉树 {

    public static TreeNode createBinTree(int array[], int num) {
        //根节点为第一个数
        TreeNode root = new TreeNode(array[num]);
        // 左孩子
        if(num * 2 + 1 < array.length){
            root.left = createBinTree(array, num * 2 + 1);
        }

        // 右孩子
        if(num * 2 + 2 < array.length){
            root.right = createBinTree(array, num * 2 + 2);
        }

        return root;
    }




}
