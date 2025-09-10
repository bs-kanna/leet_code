//time:O(N)
//space:O(LOg(N))

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
    public int maxDepth(TreeNode root) {
        if(root!=null)
            return rec(root,1);
        return 0;
    }
    int rec(TreeNode root, int count){
        if(root.left == null && root.right == null){
            // System.out.println("r: "+root.val+",  count: "+count);
            return 1;
        }
        int l=0,r=0;
        if(root.left != null){
            l = rec(root.left, count);
        }
        if(root.right != null){
            r = rec(root.right, count);
        }
        // System.out.println("r: "+root.val+",  count: "+count+", l: "+l+", r: "+r);
        count += (l>r) ? l : r;
        return count;
    }
}