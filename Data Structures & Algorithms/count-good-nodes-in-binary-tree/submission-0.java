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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
        
    }

    private int dfs(TreeNode node, int maxsofar)
    {

        if(node==null)
        {
            return 0;
        }
        int count=0;

        // If the current node's value is >= the max value on this path, it is a good node
        if (node.val >= maxsofar) {
            count = 1;
            // Update the maximum value for the subpaths
            maxsofar = node.val;
        }

        // Add good nodes found in left and right subtrees
        count += dfs(node.left, maxsofar);
        count += dfs(node.right, maxsofar);

        return count;
    }
}

