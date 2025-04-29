class Solution {
    public int minPatches(int[] nums, int n) {
        int count = 0;
        long reach = 0; // use long to avoid overflow
        int i = 0;

        while (reach < n) {
            if (i < nums.length && nums[i] <= reach + 1) {
                reach += nums[i];
                i++;
            } else {
                reach += reach + 1;
                count++;
            }
        }
        return count;
    }
}