import java.util.LinkedList;
import java.util.Stack;

public class Offer06 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        ListNode p;
        Stack<ListNode> stack = new Stack<>();
        p = head;
        while (p!=null){
            stack.push(p);
            p = p.next;
        }
        int[] output = new int[stack.size()];
        int i = 0;
        while (!stack.empty()){
            output[i++] = stack.pop().val;
            //stack.pop();
        }
        return output;
    }
}
