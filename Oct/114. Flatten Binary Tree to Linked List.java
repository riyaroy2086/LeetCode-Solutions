// https://leetcode.com/submissions/detail/831806116/

class Solution {
    
    // a Node pointing to null
    TreeNode prev = null;
    
    public void flatten(TreeNode root) {
        // Tc && Sc - O(N)
        
        if(root == null)
            return;
        
        //Preorder (Root Left Right) = Reverse PostOrder(Right,Left,Root)
        // recursive call
        flatten(root.right);
        flatten(root.left);
        
        // right child to null
        // left to null
        // & current to prev
        // for every new Node
        
        root.right = prev;
        root.left = null;
        prev = root;
        
    }
}
