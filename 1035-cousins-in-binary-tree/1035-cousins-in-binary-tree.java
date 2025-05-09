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

    static TreeNode xPar,yPar;
    static int xlevel,ylevel;

    static void isCousinsHelper(TreeNode node,TreeNode par,int x,int y,int level){
        if(node==null) return;
        if(node.val==x){
            xPar = par;
            xlevel = level;
        }

        if(node.val==y){
            yPar = par;
            ylevel = level;
        }

        isCousinsHelper(node.left,node,x,y,level+1);
        isCousinsHelper(node.right,node,x,y,level+1);

    }

    public boolean isCousins(TreeNode root, int x, int y) {
        isCousinsHelper(root,null,x,y,0);
        boolean onSamlevel = xlevel==ylevel;
        boolean onDifferentlevel = xPar!=yPar;
        return onSamlevel && onDifferentlevel;
    }
}