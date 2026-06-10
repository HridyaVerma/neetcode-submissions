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

    private List<Integer> res;
    public List<Integer> preorderTraversal(TreeNode root) {
        res=new ArrayList<>();
        Preorder(root);

        return res;
        
    }

    private void Preorder(TreeNode node)
    {
        if(node==null){
            return;
        }

        res.add(node.val);
        Preorder(node.left);
        Preorder(node.right);

    }
}