public class Offer07 {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root;
        root = build(preorder,inorder,0,preorder.length,0,inorder.length);
        return root;
    }

    public TreeNode build(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight){
        if (preLeft >= preRight || preLeft >= preorder.length)
            return null;
        TreeNode root = new TreeNode(preorder[preLeft]);
        int leftLen = 0, i = 0;
        for (i=inLeft; i<inRight; i++){
            if (inorder[i] == preorder[preLeft]){
                leftLen = i - inLeft;
                break;
            }
        }
        root.left = build(preorder,inorder,preLeft+1,preLeft+1+leftLen,inLeft,inLeft+leftLen);
        root.right = build(preorder,inorder,preLeft+1+leftLen,preRight,i+1,inRight);
        return root;
    }
}
