// https://leetcode.com/problems/kth-smallest-element-in-a-bst/

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
    public int kthSmallest(TreeNode root, int k) {
        Set<Integer> ans = new TreeSet<Integer>();
        inorderTraversal(root, ans);
        List<Integer> answer = new ArrayList<Integer>(ans);
        return answer.get(k-1);
        
    }
    void inorderTraversal(TreeNode node, Set<Integer>ans) {
        if (node == null) return;
        inorderTraversal(node.left, ans);
        ans.add(node.val);
        inorderTraversal(node.right, ans);
    }
}
