class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        int curMaxSum=0;
        int curMinSum=0;
        int maxSum=nums[0];
        int minSum=nums[0];

        for(int i=0;i<nums.length;i++){

            // kadane's algorithm to find maximum sum subarray
            curMaxSum = Math.max(curMaxSum+nums[i],nums[i]);
            maxSum = Math.max(maxSum,curMaxSum);

            // kadane's algorithm to find minimum sum subarray
            curMinSum = Math.min(curMinSum+nums[i],nums[i]);
            minSum = Math.min(minSum,curMinSum);

            // sum of all the element in the input array
            totalSum = totalSum + nums[i];
        }

        int normalSum=maxSum;
        int circularSum=totalSum-minSum;

        // if the minSum subarray is equal to totalSum subarray
        // then we just need to return the normalSum subarray
        if(minSum==totalSum){
            return normalSum;
        }

        return Math.max(normalSum,circularSum);

    }
}