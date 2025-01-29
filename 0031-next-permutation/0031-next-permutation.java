class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // find the pivot index
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        // if none is found then reverse the full array
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }

        // find the rightmost element that is bigger then the pivot element. If found then swap each other.

        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }

        // reverse the element that starts from n-1 and goes to the pivot+1
        reverse(nums,pivot+1,n-1);
    }

        static void reverse(int[] nums,int left,int right){
            while(left<right){
                swap(nums,left++,right--);
            }
        }

        static void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

}