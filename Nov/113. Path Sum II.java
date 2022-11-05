// https://leetcode.com/submissions/detail/836771805/

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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,targetSum,new ArrayList<>(),res);
        return res;    
        
    }
    
    public void dfs(TreeNode root, int targetSum, List<Integer> ans,List<List<Integer>> res){
        if(root == null) return;
        if(targetSum == root.val && root.left == null && root.right == null){
            ans.add(root.val);
            res.add(new ArrayList<> (ans));
            ans.remove(ans.size()-1);
            return;
        }
         ans.add(root.val);
         dfs(root.left,targetSum - root.val,ans , res);
         dfs(root.right,targetSum - root.val,ans , res);
         ans.remove(ans.size()-1);
         //return;
    }
}
