class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }

        int longestStreak=0;

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){
                int currentNum=nums[i];
                int currentStreak=1;

                while(hs.remove(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}