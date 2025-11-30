class Solution {
    public int subarraySum(int[] nums, int k)  {
       Map<Integer,Integer> prefixSumCount = new HashMap<>();


       int count=0;
       int curSum=0;

       prefixSumCount.put(0,1);

       for(int num:nums){
        curSum+=num;

        if(prefixSumCount.containsKey(curSum-k)){
            count+=prefixSumCount.get(curSum-k);
        }

        prefixSumCount.put(curSum,prefixSumCount.getOrDefault(curSum,0)+1);

       }


        return count;
    }
       
}