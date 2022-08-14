// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/

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
    
    List<Integer> ans;
    
    public int maxLevelSum(TreeNode root) {
        ans = new ArrayList<>();
        
        dfs(root, 1);
        
        int pos=0;
        for(int i=1; i<ans.size(); i++) {
            if(ans.get(i) > ans.get(pos)) pos = i;
        }
        
        return pos+1;
        
        
    }
    
    public void dfs(TreeNode node, int depth) {
        
        if (node != null) {
            if(ans.size() < depth) {
                ans.add(0);
            }
            
            ans.set(depth-1, node.val + ans.get(depth-1));
            dfs(node.left, depth+1);
            dfs(node.right, depth+1);
        }
    }
}
