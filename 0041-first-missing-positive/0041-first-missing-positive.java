class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int curInd=0;curInd<n;curInd++){
            while(nums[curInd]>0 && nums[curInd]<=n && nums[curInd]!=nums[nums[curInd]-1]){
                int targetInd = nums[curInd]-1;
                swap(nums,curInd,targetInd);
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!= i+1){
                return i+1;
            }
        }

        return n+1;

    }

    public static void swap(int nums[], int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}