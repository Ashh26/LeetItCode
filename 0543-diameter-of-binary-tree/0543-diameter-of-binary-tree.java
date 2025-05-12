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
        private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       calculateHeight(root);
        return diameter;
    }

    private int calculateHeight(TreeNode node) {
        if (node == null) return 0;

        int left = calculateHeight(node.left);
        int right = calculateHeight(node.right);

        // update diameter: number of edges = left + right
        diameter = Math.max(diameter, left + right);

        // return height of this node
        return 1 + Math.max(left, right);
    }
}