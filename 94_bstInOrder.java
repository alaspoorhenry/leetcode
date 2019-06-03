/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


import java.util.*;

class Solution {
    private List<Integer> order = new ArrayList<Integer>();
    
    public void inorderTraversalHelper(TreeNode root) {
        if (root == null){
            return;
        }
        
        //order.add(root.val);
        inorderTraversalHelper(root.left);
        order.add(root.val);
        inorderTraversalHelper(root.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
    	this.inorderTraversalHelper(root);
    	return this.order;
    }
    
}
