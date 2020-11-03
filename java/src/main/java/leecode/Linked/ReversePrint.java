package leecode.Linked;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
  }

public class ReversePrint {

    static List<ListNode> nodeList = new LinkedList<>();

    public static void main(String[] args) {
        ListNode l1 =new ListNode(1);
        ListNode l2 =new ListNode(3);
        ListNode l3 =new ListNode(2);
        ListNode l4 =new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next =l4;
        int[] ints = reversePrint(l1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        int[] a = new int[stack.size()];
        int i =0;
        while (!stack.isEmpty()) {
            a[i++] = stack.pop().val;
        }

            return a;
    }
}
