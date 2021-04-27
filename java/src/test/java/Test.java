public class Test {
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null)
            return null;

        ListNode temp = head;

        while(temp!=null){
            if(temp.next!=null&&temp.val!=temp.next.val){
                temp = temp.next;
                continue;
            }


            ListNode start = temp;
            while(start.next!=null&&start.val == start.next.val){
                start = start.next;
            }
            temp.next = start.next;
            temp = start.next;
            start.next=null;
        }
        return head;

    }

    @org.junit.Test
    public void test(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next=new ListNode(2);
        deleteDuplicates(head);
    }


}


