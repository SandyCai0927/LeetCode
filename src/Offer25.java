public class Offer25 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        l3.next=null;
        ListNode p,q,s;
        p=l1;
        q=l2;
        s=l3;

        while (p!=null&&q!=null){
            if (p.val>=q.val){
                l1=p.next;
                p.next=s.next;
                s.next=p;
                s=p;
                p=l1;
            }
            else{
                l2=q.next;
                q.next=s.next;
                s.next=q;
                s=q;
                q=l2;
            }
        }

        if (p!=null){
            s.next=p;
        }
        else{
            s.next=q;
        }

        //删除多余的头结点
        s=l3;
        l3=s.next;
        s.next=null;

        return l3;
    }
}
