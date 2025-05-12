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

     static class Pair {
        int hd;     // horizontal distance (column)
        int row;    // depth level (row)
        TreeNode node;

        public Pair(int hd, int row, TreeNode node) {
            this.hd = hd;
            this.row = row;
            this.node = node;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();

        // map: col -> (row -> minHeap of node values)
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        q.add(new Pair(0, 0, root));

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int col = cur.hd;
            int row = cur.row;
            TreeNode node = cur.node;

            map
                .computeIfAbsent(col, x -> new TreeMap<>())
                .computeIfAbsent(row, x -> new PriorityQueue<>())
                .add(node.val);

            if (node.left != null) {
                q.add(new Pair(col - 1, row + 1, node.left));
            }
            if (node.right != null) {
                q.add(new Pair(col + 1, row + 1, node.right));
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> colMap : map.values()) {
            List<Integer> colList = new ArrayList<>();
            for (PriorityQueue<Integer> nodes : colMap.values()) {
                while (!nodes.isEmpty()) {
                    colList.add(nodes.poll());
                }
            }
            result.add(colList);
        }

        return result;
    }
}