class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            result[i]=sum;
        }
        return result;
    }
}