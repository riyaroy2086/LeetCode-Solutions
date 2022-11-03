// https://leetcode.com/submissions/detail/836038648/

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        // using Stack
        // TC -> O(N) and sc-> O(h) i.e. h= height of the binary tree
        
        Deque<TreeNode> q = new ArrayDeque<>();
        
        while(root != null){
            q.push(root);
            root = root.left; // pushing all the elements by incrementing the index
        }
        
        // traversing till k-1
        // for the kth smallest
        for(int i=0;i<k-1;i++){
            root = q.pop();
            root = root.right;
            
            while(root != null){
            q.push(root);
            root = root.left; // pushing all the elements by incrementing the index
            }
            
        }
        return q.peek().val;
        
        
    }
}