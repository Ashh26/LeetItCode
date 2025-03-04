class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();

        for(int n:nums){
            int count = hm.getOrDefault(n,0);
            hm.put(n,count+1);
        }

        Set<Map.Entry<Integer,Integer>> entry = hm.entrySet();
        for(Map.Entry<Integer,Integer> me:entry){
            if(me.getValue()>1){
                duplicates.add(me.getKey());
            }
        }
        return duplicates;
    }
}