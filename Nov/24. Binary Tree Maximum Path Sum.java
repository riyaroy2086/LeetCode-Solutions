// https://leetcode.com/submissions/detail/836195401/

class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        pathSum(root);
        return maxSum;
    }
    public int pathSum(TreeNode root){
        if(root == null) return 0;
        int leftSum = Math.max(0,pathSum(root.left));
        int rightSum = Math.max(0,pathSum(root.right));
        
        if((leftSum + rightSum + root.val) > maxSum)
            maxSum = leftSum + rightSum + root.val;
        
        return root.val + Math.max(leftSum,rightSum);
    }
}
