import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }
   class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
      this.val = val;
    }
  }

public class Solution {

    boolean flag = false;
    public ListNode[] solve (TreeNode root, int[] b) {
        int len = b.length;
        ListNode[] res = new ListNode[len];


        List<List<ListNode>> list = new ArrayList<>();

        for (int i = 0; i < len;i++) {
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> reverStack = new Stack<>();

            getPath(root,stack,b[i]);
            flag = false;

            while (!stack.isEmpty()){
                reverStack.push(stack.pop());
            }

            Integer value = reverStack.pop();
            ListNode temp = new ListNode(value);
            res[i] = temp;

            while (!reverStack.isEmpty()){
                ListNode node = new ListNode(reverStack.pop());
                temp.next = node;
                temp = temp.next;
            }

        }
        return res;
    }

    public void getPath(TreeNode root,Stack<Integer> stack,int num){
        if(root==null)
            return;
        stack.push(root.val);

        if(!flag&&root.val==num){
            flag=true;
            return;
        }
        if(!flag&&root.left!=null){
            getPath(root.left,stack,num);
        }
        if(!flag&&root.right!=null){
            getPath(root.right,stack,num);
        }
        if(!flag)
            stack.pop();

    }
}