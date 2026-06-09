class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        // Base case: tree is empty or key not found
        if (root == null) {
            return null;
        }

        // Use BST properties to find the node efficiently
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node to be deleted found!

            // Case 1 & 2: No child or only one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            // Find the inorder successor (smallest in the right subtree)
            TreeNode minNode = findMin(root.right);
            // Replace current value with successor value
            root.val = minNode.val;
            // Delete the duplicate successor node from the right subtree
            root.right = deleteNode(root.right, minNode.val);
        }
        return root;
    }

    // Helper method to find the minimum node in a subtree
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
