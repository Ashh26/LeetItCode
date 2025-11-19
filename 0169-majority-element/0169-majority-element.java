class Solution {
   static int majorityElement(int arr[]) {

        int freq=0;
        int ans=0;

        for(int nums:arr){
            if(freq==0){
                ans=nums;
            }
            if(ans==nums){
                freq++;
            }else{
                freq--;
            }
        }
        return ans;
   }
}