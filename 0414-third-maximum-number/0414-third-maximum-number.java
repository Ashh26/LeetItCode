class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;

        for(int arr:nums){

            if(arr==first || arr==second || arr==third){
                continue;
            }

            if(arr>first){
                third=second;
                second=first;
                first=arr;
            }else if(arr>second){
                third=second;
                second=arr;
            }else if(arr>third){
                third=arr;
            }
        }
        return (int)(third==Long.MIN_VALUE ? first:third);
    }
}