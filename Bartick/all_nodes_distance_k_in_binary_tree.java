// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> parent;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        parent = new HashMap();
        dfs(root, root);

        Queue<TreeNode> queue = new LinkedList();
        queue.add(target);

        Set<TreeNode> seen = new HashSet();
        seen.add(target);

        int dist = 0;
        while (!queue.isEmpty() && dist<K) {
            int size = queue.size();
            dist++;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if (!seen.contains(node.left) && node.left!=null) {
                    seen.add(node.left);
                    queue.offer(node.left);
                }
                if (!seen.contains(node.right)&& node.right!=null) {
                    seen.add(node.right);
                    queue.offer(node.right);
                }
                TreeNode par = parent.get(node);
                if (!seen.contains(par)) {
                    seen.add(par);
                    queue.offer(par);
                }
            }
        }

        return queue.stream()
                    .map(n -> n.val)
                    .collect(Collectors.toList());
    }

    public void dfs(TreeNode node, TreeNode par) {
        if (node != null) {
            parent.put(node, par);
            dfs(node.left, node);
            dfs(node.right, node);
        }
    }
}
