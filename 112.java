// Definition for a binary tree node.
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
         return hasPathSum(root,root.val,targetSum);
    }
    public boolean hasPathSum(TreeNode root,int sum, int targetSum){
        // System.out.println(root.val);
        if(root.left==null && root.right==null) return sum == targetSum;
        if(root.left!=null && hasPathSum(root.left,(sum+root.left.val),targetSum)) return true;
        if(root.right!=null && hasPathSum(root.right,(sum+root.right.val),targetSum)) return true;
        return false;
    }
}