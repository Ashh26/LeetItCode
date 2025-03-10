class Solution {
    public int sumOfUnique(int[] nums) {
        // HashTable<Integer,Integer> ht = new HashTable<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int uniqueSum=0;

        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,0);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)==0){
                uniqueSum+=key;
            }
        }
        return uniqueSum;
    }
}