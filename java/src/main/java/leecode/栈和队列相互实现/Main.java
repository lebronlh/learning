package leecode.栈和队列相互实现;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
    Integer val;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer val){
        this.val = val;
    }
}

public class Main {
    static LinkedList<Integer> res = new LinkedList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numsString = sc.nextLine();
        int count = sc.nextInt();
        if("[]".equals(numsString)){
            System.out.println("[]");
        }else{
            numsString = numsString.substring(1,numsString.length()-1);
            String[] split = numsString.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(split[0]));
            Queue<TreeNode> queue = new LinkedList<TreeNode>(){
                {
                    add(root);
                }
            };
            int i =1;
            while(i<split.length && !queue.isEmpty()){
                TreeNode node = queue.poll();
                if(!split[i].equals("null")){
                    node.left = new TreeNode(Integer.parseInt(split[i]));
                    queue.add(node.left);
                }
                i++;

                if(i<split.length && !split[i].equals("null")){
                    node.right = new TreeNode(Integer.parseInt(split[i]));
                    queue.add(node.right);
                }
                i++;
            }

            recur(root,count);
            System.out.println(res.toString().replaceAll(" ",""));
        }




    }

    public  static void  recur(TreeNode root,int target){
        if(root ==null)
            return;

        path.add(root.val);
        target =target-root.val;

        if(target == 0){
            if(res.size()==0){
                res = new LinkedList<>(path);
            }else{
                if(res.size()>path.size()){
                    res.clear();
                    res = new LinkedList<>(path);
                }
            }
        }

        recur(root.left,target);
        recur(root.right,target);
        path.removeLast();
    }


}
