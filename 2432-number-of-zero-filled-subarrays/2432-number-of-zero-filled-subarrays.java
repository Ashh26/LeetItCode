class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long zeros = 0;

        for (int num : nums) {
            if (num == 0) {
                zeros++;
                count += zeros; // Add all subarrays ending at this zero
            } else {
                zeros = 0; // Reset count when a non-zero is encountered
            }
        }

        return count;
    }
}