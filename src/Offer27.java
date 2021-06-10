public class Offer27 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val=val;}
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root==null)
            return null;

        TreeNode temp=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(temp);

        return root;
    }
}
