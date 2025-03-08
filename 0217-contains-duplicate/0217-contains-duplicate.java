class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int element:nums){
            if(hs.contains(element)){
                return true;
            }else{
                hs.add(element);
            }
        }
        return false;
    }
}