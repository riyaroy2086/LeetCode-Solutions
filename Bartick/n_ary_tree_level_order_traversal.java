// https://leetcode.com/problems/n-ary-tree-level-order-traversal/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
   public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        DFS(root, ans, 1);
        
        return ans;
    }
    
    private void DFS(Node root, List<List<Integer>> ans, int depth) {
        if(root == null) return;
        
        if(ans.size() < depth) {
            ans.add(new ArrayList<>());
        }
        
        ans.get(depth - 1).add(root.val);
        
        for(Node child : root.children) {
            DFS(child, ans, depth + 1);
        }
    }
}
