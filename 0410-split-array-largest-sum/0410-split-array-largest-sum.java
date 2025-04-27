class Solution {
    public int splitArray(int[] nums, int k) {
        int low = getMax(nums);       // Minimum possible max sum
        int high = getSum(nums);      // Maximum possible max sum
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canSplit(nums, k, mid)) {
                ans = mid;        // Try to minimize
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    private int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
    
    private int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
    
    private boolean canSplit(int[] nums, int k, int maxAllowedSum) {
        int splits = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > maxAllowedSum) {
                splits++;
                currentSum = num;    // Start new split
            } else {
                currentSum += num;
            }
        }
        
        return splits <= k;
    }
}
