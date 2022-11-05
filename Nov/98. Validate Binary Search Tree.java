// https://leetcode.com/submissions/detail/837518522/

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
    public boolean isValidBST(TreeNode root) {
       // using Stack
        Deque<TreeNode> q = new ArrayDeque<>();
        TreeNode prev = null; // taking a node pointing to null
        
        while(root != null ||!q.isEmpty()){
            while(root!= null){
                q.push(root);
                root = root.left;
            }
            // all left view nodes are already entered
            root = q.pop(); // storing the left values in root to compare
            if(prev != null && prev.val >= root.val){
                return false;
            }
            // right side is greater
            // increment
            prev = root;
            root = root.right;
        }
        return true;
    }
}
