
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        else if(p==null || q==null)
            return false;
        else{
            return rec(p,q);
        }
    }
    Boolean rec (TreeNode lhs, TreeNode rhs){
        if(lhs.val != rhs.val) return false;
        if(!(((lhs.left != null) == (rhs.left != null)) 
                && ((lhs.right != null) == (rhs.right != null))))
            return false;
        // if(lhs.left == null && rhs.left == null){
        //     System.out.println(lhs.val+"---"+rhs.val);
        // }
        if(lhs.left != null && rhs.left != null){
            if(!rec(lhs.left, rhs.left)) return false;
        }
        if(lhs.right != null && rhs.right != null){
            if(!rec(lhs.right, rhs.right)) return false;
        }
        return true;

    }
}