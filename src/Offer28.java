import java.util.ArrayList;
import java.util.List;

public class Offer28 {
    class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){this.val=val;}
    }

    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;
        else {
            return check(root.left,root.right);
        }
    }

    public boolean check(TreeNode left,TreeNode right) {
        if (left==null&&right==null)
            return true;
        else if (left==null&&right!=null||left!=null&&right==null)
            return false;
        else {
            if (left.val==right.val) {
                return check(left.left,right.right)&&check(left.right,right.left);
            }
            return false;
        }
    }
}
