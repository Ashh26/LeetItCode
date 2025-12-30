class Solution {

    public void solve(int[] nums,List<List<Integer>> ans,int i){
        if(i>=nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            ans.add(list);
            return;
        }

        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            solve(nums,ans,i+1);
            swap(nums,i,j);
        }

    }

    public void swap(int[] nums,int x,int y){
        int temp = nums[x];
         nums[x] = nums[y];
         nums[y] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int i=0;
        solve(nums,ans,i);
        return ans;
    }
}