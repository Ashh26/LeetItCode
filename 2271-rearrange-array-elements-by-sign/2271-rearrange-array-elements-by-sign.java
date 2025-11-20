class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // add different element into different list
        for(int num:nums){
            if(num>=0){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }

        int posInd=0,negInd=0,i=0;
        // Now make one new array and add different element from both the list one by one +ve then -ve
        int[] result = new int[nums.length];

        while(posInd<pos.size() && negInd<neg.size()){
            if(i%2==0){
                result[i++] = pos.get(posInd++);
            }else{
                result[i++] = neg.get(negInd++);
            }
        }

        // Now add remaining positive elements
        while(posInd<pos.size()){
            result[i++] = pos.get(posInd++);
        }

        // Now add remaining negative elements
        while(negInd<neg.size()){
            result[i++] = neg.get(negInd++);
        }

        return result;

    }
}