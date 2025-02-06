class Solution {

    public int max(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }

    public int min(int a,int b, int c){
        return Math.min(a,Math.min(b,c));
    }

    public int maxProduct(int[] nums) {
        int result = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for(int i=1;i<nums.length;i++){
            int temp =   max(nums[i],nums[i]*curMax,nums[i]*curMin);

               curMin = min(nums[i],nums[i]*curMax,nums[i]*curMin);

               curMax = temp;
            
            result = Math.max(result,curMax);
        }

        return result;

    }
}