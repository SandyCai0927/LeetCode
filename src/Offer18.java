public class Offer18 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode p=head;
        if (head.val==val){
            head=head.next;
            p.next=null;
            return head;
        }
        while (p.next!=null){
            if (p.next.val==val){
                p.next=p.next.next;
                break;
            }
            p=p.next;
        }
        return head;
    }
}
