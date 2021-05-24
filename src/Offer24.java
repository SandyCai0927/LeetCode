public class Offer24 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head==null)
            return head;

        ListNode p,q;
        p=head.next;
        head.next=null;
        while (p!=null){
            q=p.next;
            p.next=head;
            head=p;
            p=q;
        }

        return head;
    }

}
