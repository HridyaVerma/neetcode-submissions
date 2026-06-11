class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Integer min, Integer max) {
        // An empty tree/branch is always a valid BST
        if (node == null) {
            return true;
        }

        // The current node's value must sit strictly within the allowed min and max bounds
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Update bounds for subtrees:
        // Left subtree values must be less than current node.val (updates max bound)
        // Right subtree values must be greater than current node.val (updates min bound)
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
