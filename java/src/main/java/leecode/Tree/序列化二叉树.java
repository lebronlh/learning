package leecode.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * /**
 *          * 设 mm 为列表区间 [0, n][0,n] 中的 null 节点个数，
 *          * 则可总结出根节点、左子节点、右子节点的列表索引的递推公式：
 *          * n为node的列表索引，node.left =2(n-m)+1;node.right = 2(n-m)+2
 *          * 如果node为空 node.left无，node.right无
 *          *
 *if(data.equals("[]"))
         *return null;
         *String[]strings=data.substring(1,data.length()-1).split(",");
         *         //根节点
         *TreeNode root=new TreeNode(Integer.parseInt(strings[0]));
         *int i=1;//从第二个节点开始遍历
         *
         *Queue<TreeNode> queue=new LinkedList<>();
        *queue.add(root);
        *while(!queue.isEmpty()){
        *TreeNode node=queue.poll();
        *if(!strings[i].equals("null")){
        *node.left=new TreeNode(Integer.parseInt(strings[i]));
        *queue.add(node.left);
        *
        *}
        *
        *i++;
        *
        *if(!strings[i].equals("null")){
        *node.right=new TreeNode(Integer.parseInt(strings[i]));
        *queue.add(node.right);
        *}
        *i++;
        *
        *}
        *
        *return root;
 */
public class 序列化二叉树 {
    public String serialize(final TreeNode root){
        //层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        if(root!=null)
            queue.add(root);
        else
            return "[]";
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node==null)
                res.append("null,");
            else{
                res.append(node.val+",");
                queue.add(node.left);
                queue.add(node.right);
            }

        }
        res.deleteCharAt(res.length()-1);
        res.append("]");
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if(data.equals("[]")||data.equals("[null]")||data.isEmpty())
            return null;
        String substring = data.substring(1, data.length() - 1);
        String[] strings = substring.split(",");
        Queue<TreeNode> queue = new LinkedList<>();

         TreeNode root = new TreeNode(Integer.parseInt(strings[0]));
         TreeNode temp = root;
        queue.add(temp);

        for(int i =1;i<strings.length;i=i+2){
           if(!queue.isEmpty()){
               TreeNode node = queue.poll();
               if(!"null".equals(strings[i])){
                   node.left=new TreeNode(Integer.parseInt(strings[i]));
                   queue.add(node.left);
               }
               if(i+1<strings.length&&!"null".equals(strings[i+1])){
                   node.right=new TreeNode(Integer.parseInt(strings[i+1]));
                   queue.add(node.right);
               }
           }

        }
        return root;
    }
}
