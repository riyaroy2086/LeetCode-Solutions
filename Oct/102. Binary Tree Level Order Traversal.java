// https://leetcode.com/submissions/detail/834062685/

class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root,0);
        return res;    
    }
    
    private void bfs(TreeNode root , int num){
        if(root == null)
            return ; // edge case
        
        int len= res.size();
        if(len <= num) // traversing the entire level 
             res.add(new ArrayList<>());           // and then including it as an ArrayList in the List of Lists res
         
        // preorder traversal 
        // root , left ,rt
        res.get(num).add(root.val); // fixing the particular lvl and then adding the root value
        bfs(root.left,num+1);
        bfs(root.right,num+1);
    }
}
