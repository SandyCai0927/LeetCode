public class Offer22 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p,q;
        p=head;
        q=head;
        for (int i=0;i<k;i++){
            q=q.next;
            if (q==null)
                break;
        }
        while (q!=null){
            p=p.next;
            q=q.next;
        }
        return p;
    }
}
