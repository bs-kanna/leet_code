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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(checkBalance(root,0).max<=-1) return false;
        return true;
    }
    Res checkBalance(TreeNode root, int depth){
        int left = 0, right = 0;
        // System.out.println(root.val+", d:"+(depth));
        if(root.left!=null) left = checkBalance(root.left, depth+1).max+1;
        if(root.right!=null) right = checkBalance(root.right, depth+1).max+1;
        // System.out.println(root.val+", l:"+(left)+", r:"+(right));
        if(root.left== null && root.right==null){
            // System.out.println(Arrays.toString(new int[]{0,0}));
            return new Res (0,0,0);
        }
        if(Math.abs(left-right)>1 || left<=-1 || right<=-1){
            // System.out.println(Arrays.toString(new int[]{-2,-2}));
            return new Res(-2,-2,-2);
        }
        // System.out.println(Arrays.toString(new int[]{left,right}));
        return new Res(left,right,(left>right)?left:right);
    }
}
class Res{
    int l;
    int r;
    int max;

    Res(int l, int r, int max){
        this.l = l;
        this.r = r;
        this.max = max;

    }
}