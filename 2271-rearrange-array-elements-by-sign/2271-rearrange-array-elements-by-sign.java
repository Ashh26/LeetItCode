class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[] = new int[nums.length];
        int posInd=0;
        int negInd=1;

        for(int num:nums){
            if(num>=0){
                result[posInd] = num;
                posInd = posInd+2;
            }else{
                result[negInd] = num;
                negInd = negInd+2;
            }
        }
        return result;

    }
}