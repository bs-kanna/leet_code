
//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        else if(root.left == null && root.right == null)
            return 1;
        int left = -1, right = -1;
        if(root.left != null) left = minDepth(root.left);
        if(root.right != null) right = minDepth(root.right);
        if(left==-1 || right==-1){
            // System.out.println(root.val+", l:"+(left)+", r:"+(right));
            return Math.max(left,right)+1;
        }
        // System.out.println(root.val+", l:"+(left)+", r:"+(right));
        return Math.min(left,right)+1;
    }
}