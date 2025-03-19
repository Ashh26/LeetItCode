class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int minLength=Integer.MAX_VALUE;
        int curSum=0;
        int n=nums.length;
        while(r<n){
            curSum=curSum+nums[r];
            while(curSum>=target){
                minLength=Math.min(minLength,r-l+1);
                curSum=curSum-nums[l];
                l++;
            }
            r++;
        }
        if(minLength==Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
}