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

 private int ans=0;

class Solution {

    public int calculateheight(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=calculateheight(root.left);
        int right=calculateheight(root.right);

        ans=Math.max(left+right,ans);
        return Math.max(left, right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        calculateheight(root);

        return ans;
        
    }
}
