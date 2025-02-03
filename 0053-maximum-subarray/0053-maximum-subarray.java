class Solution {
    public int maxSubArray(int[] nums) {

         // Function to find the maximum subarray sum
        int result = nums[0];
        int maxEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            // Find the maximum sum ending at index i by either extending 
            // the maximum sum subarray ending at index i - 1 or by
            // starting a new subarray from index i
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
          
            // Update result if maximum subarray sum ending at index i > result
            result = Math.max(result, maxEnding);
        }
        return result;
    
    }
}




//         int result = nums[0]; // 6


//         // Oouter loop for starting point of subarray
//         for(int i=0;i<nums.length;i++){
//             int currSum=0;

//             // Inner loop for ending point of subarray
//             for(int j=i;j<nums.length;j++){
//                 currSum = currSum+nums[j]; // 

//                 // Update result if currSum is greater than result.
//                 result = Math.max(result,currSum);
//                 // result = 6
//             }
//         }
//         return result;


