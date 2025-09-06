// Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        else if(root.left == null && root.right == null){
            res.add(root.val);
            return res;
        }
            
        Stack<TreeNode> nodes = new Stack<>();
        List<TreeNode> visited = new ArrayList<>();
        TreeNode curr = root;
        // nodes.push(curr);
        while (curr!=null) {
            if (!nodes.empty() && !visited.isEmpty() && visited.contains(curr)) {
                curr = nodes.pop();
                // print("1.",curr.val, nodes, res);
                if(nodes.empty() 
                    && ((curr.right == null)
                        || (!visited.isEmpty() && visited.contains(curr.right)))
                    && (!visited.isEmpty() && visited.contains(curr)))
                    curr = null;
            }else if (curr.left != null
                    && (visited.isEmpty() || !visited.contains(curr.left))) {
                // print("2.",curr.val, nodes, res);
                nodes.push(curr);
                curr = curr.left;
            } else if (curr.left == null
                    && (visited.isEmpty() || !visited.contains(curr))) {
                res.add(curr.val);
                visited.add(curr);
                if(curr.right!=null){
                    nodes.push(curr);
                    curr=curr.right;
                }
                // print("3.",curr.val, nodes, res);       
            } else if (curr.right != null
                    && (visited.isEmpty() || !visited.contains(curr.right))) {
                nodes.push(curr);
                res.add(curr.val);
                visited.add(curr);
                // print("4.",curr.val, nodes, res);
                curr = curr.right;
            } else if (curr.right == null) {
                res.add(curr.val);
                visited.add(curr);
                // print("5.",curr.val, nodes, res);
                if(nodes.empty())
                    curr = null;
            }

            // System.out.println(res);
        }
        return res;
    }
    void print(String pos,int val, Stack<TreeNode> nodes, List<Integer> res){
        System.out.println(pos+" c:" + val + 
                    " n:" + (nodes.empty() ? "e" : nodes.peek().val) + " " + res);
    }
}