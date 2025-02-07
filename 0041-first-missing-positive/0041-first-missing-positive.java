class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){

            while(nums[i]>=1 && nums[i]<=n-1 && nums[i]!=nums[nums[i]-1]){
                int temp = nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;
            }
        }

        for(int i=1;i<=n;i++){
            if(i!=nums[i-1]){
                return i;
            }
        }

        return n+1;

    }
}