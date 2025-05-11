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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans = rightviewHelper(root,0,ans);
        return ans;
    }

    ArrayList<Integer> rightviewHelper(TreeNode root,int level,ArrayList<Integer> ans){
        if(root==null)return ans;
        if(level>=ans.size()){
            ans.add(root.val);
        }
        rightviewHelper(root.right,level+1,ans);
        rightviewHelper(root.left,level+1,ans);
        return ans;
    }

}