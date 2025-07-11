class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
    int r = nums.length - 1;
    int result = -1;

    while (l <= r) {
      int m = (l + r) >>> 1;

      if (target == nums[m]) {
        result = m;      // store the index
        r = m - 1;       // continue searching on the left side
      } else if (nums[m] == nums[l] && nums[m] == nums[r]) {
        l++;
        r--;
      } else if (nums[l] <= nums[m]) {
        if (nums[l] <= target && target < nums[m]) {
          r = m - 1;
        } else {
          l = m + 1;
        }
      } else {
        if (nums[m] < target && target <= nums[r]) {
          l = m + 1;
        } else {
          r = m - 1;
        }
      }
    }

    return result;
    }
}