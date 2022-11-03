// https://leetcode.com/submissions/detail/836206496/

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false; // edge case
        if(root.left == null && root.right == null && targetSum == root.val) return true; // leaf with no children
        
        // recursive call to increment in a tree
        return hasPathSum(root.left,(targetSum - root.val)) || hasPathSum(root.right,(targetSum-root.val));
            // going left or tight and simulataneously subtracting the root value from the target sum
    }
}
