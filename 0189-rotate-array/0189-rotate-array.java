class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==0) return;

        k = k%n;
        int i,j;

        // reverse last k element
        for(i=n-k,j=n-1;i<j;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //reverse first n-k element
        for(i=0,j=n-k-1;i<j;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // reverse the whole array
        for(i=0,j=n-1;i<j;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }
}