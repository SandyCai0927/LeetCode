public class Offer26 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val=val;}
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A==null||B==null)
            return false;
        return dfs(A,B);
    }

    public boolean dfs(TreeNode A,TreeNode B){
        if (A==null)
            return false;
        else if (B==null) {
            return true;
        }
        else{
            return isSame(A,B)||dfs(A.left,B)||dfs(A.right,B);
        }
    }

    public boolean isSame(TreeNode A,TreeNode B){
        if (A==null&&B==null){
            return true;
        }
        else if (A==null&&B!=null) {
            return false;
        }
        else if (A!=null&&B==null) {
            return true;
        }
        else {
            if (A.val!=B.val) {
                return false;
            }
            else {
                return isSame(A.left,B.left)&&isSame(A.right,B.right);
            }
        }
    }
}
