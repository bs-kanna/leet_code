
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
    public boolean isSymmetric(TreeNode root) {
        if (root.left != null && root.right != null)
            return check(root.left, root.right);
        else if (root.left == null && root.right == null)
            return true;
        return false;
    }

    boolean check(TreeNode lhs, TreeNode rhs) {
        // System.out.println("1. "+lhs.val+", "+rhs.val);
        if ((lhs.val != rhs.val)
            || !(((lhs.right != null) == (rhs.left != null)) 
                && ((lhs.left != null) == (rhs.right != null))))
            return false;
        // System.out.println("2. "+lhs.val+", "+rhs.val);
        if (lhs.right != null && rhs.left != null)
            if (!check(lhs.right, rhs.left))
                return false;
        if (lhs.left != null && rhs.right != null)
            if (!check(lhs.left, rhs.right))
                return false;
        return true;
    }
}