//https://leetcode.com/submissions/detail/834005944/

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

// creating the class Pair
class Pair{
    int num;
    TreeNode node ;
    Pair(TreeNode _node,int _num){
       num = _num;
       node = _node;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        // edge case
        if(root == null) return 0;
        
        int res = 0;
        Queue<Pair> q= new LinkedList<>();
        
        q.offer(new Pair(root,0)); // pushing the 0th   index
        while(!q.isEmpty()){
            int len = q.size(); 
            int min = q.peek().num;
            int f=0,l=0;
            for(int i=0;i<len;i++){
                int curr = q.peek().num - min; 
                // as it is not always 1
                TreeNode node = q.peek().node;
                q.poll();
                // first and last are imp
                // to store seperately
                if(i==0) f= curr;
                if(i == len-1) l = curr;
                // left and right same lvl traversal
                if(node.left != null){
                    q.offer(new Pair(node.left,curr*2+1));   
                }
                if(node.right != null){
                    q.offer(new Pair(node.right,curr*2+2));   
                }
            }
            // updating the min
            res= Math.max(res,l-f+1);
        }
        
        return res;
        
    }
}
