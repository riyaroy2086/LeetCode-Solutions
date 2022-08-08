// https://leetcode.com/problems/diameter-of-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculate(root);
        
        return max;
    }
    
    private int calculate(TreeNode root) {
        if(root==null) return 0;
        
        int leftDiameter = calculate(root.left);
        int rightDiameter = calculate(root.right);
        
        max = Math.max(max, leftDiameter+rightDiameter);
        
        return Math.max(leftDiameter, rightDiameter) + 1;
    }
}
