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

    static void distanceKDown(TreeNode root,int k, List<Integer> ans){
            if(root==null || k<0) return;
            if(k==0){
                ans.add(root.val);
                return; 
                }
            distanceKDown(root.left,k-1,ans);
            distanceKDown(root.right,k-1,ans);
  }


    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
         ArrayList<Integer> ans = new ArrayList<>();
        distanceKFromTarget(root,target,k,ans);
        return ans;
    }

    static int distanceKFromTarget(TreeNode root,TreeNode target,int k,List<Integer> ans){
    if(root==null) return -1;

    if(root==target){
      distanceKDown(root,k,ans);
      return 0;
    }
    int dl =distanceKFromTarget(root.left,target,k,ans);
    if(dl!=-1){
      if(dl+1==k){
        ans.add(root.val);
      }else{
      distanceKDown(root.right,k-dl-2,ans);
      }
      return dl+1;
    }
    int dr = distanceKFromTarget(root.right,target,k,ans);
    if(dr!=-1){
      if(dr+1==k){
        ans.add(root.val);
      }else{
      distanceKDown(root.left,k-dr-2,ans);
      }
      return dr+1;
    }
    return -1;
  }

}