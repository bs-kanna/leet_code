import java.util.Arrays;


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
    public TreeNode sortedArrayToBST(int[] nums) {
        return rec(Arrays.copyOf(nums,(nums.length/2)),
            Arrays.copyOfRange(nums,(nums.length/2)+1,nums.length),nums[(nums.length/2)]);
    }
    TreeNode rec(int[] lhs, int[] rhs, int i){
        if((rhs.length<=1)&&(lhs.length<=1)){
            TreeNode lt = (lhs.length>0) ? new TreeNode(lhs[0]) : null;
            TreeNode rt = (rhs.length>0) ? new TreeNode(rhs[0]) : null;
            // System.out.println(lt.val+", "+i+", "+rt.val);
            return new TreeNode(i,lt,rt);
        }
            TreeNode r = new TreeNode(i);
            r.left = rec(Arrays.copyOf(lhs,(lhs.length/2)),
                Arrays.copyOfRange(lhs,(lhs.length/2)+1,lhs.length),lhs[lhs.length/2]);

            r.right = rec(Arrays.copyOf(rhs,(rhs.length/2)),
                Arrays.copyOfRange(rhs,(rhs.length/2)+1,rhs.length),rhs[rhs.length/2]);

            // System.out.println(r.left.val+", "+r.val+", "+r.right.val);
        return r;
    }
}