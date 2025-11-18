class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> result = new ArrayList<>();

        // add the first array element into the hashset 
        HashSet<Integer> sa = new HashSet<>();
        for(int nums:nums1){
            sa.add(nums);
        }

        // traverse and checking the second array element that is present in the first array element.
        // if yes then add it to result.
        for(int nums:nums2){
            if(sa.contains(nums)){
                result.add(nums);
                sa.remove(nums);
            }
        }

        // Now converting arrayList into array
        int[] ans = result.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}