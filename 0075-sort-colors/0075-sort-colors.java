class Solution {

    public static void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;        
    }

    public void sortColors(int[] nums) {
        int leftBoundry = -1;
        int rightBoundry = nums.length;
        int current = 0;

        while(current<rightBoundry){
            if(nums[current]==0){
                leftBoundry++;
                swap(nums,leftBoundry,current);
                current++;
            }else if(nums[current]==2){
                rightBoundry--;
                swap(nums,rightBoundry,current);
            }else{
                current++;
            }
        }

    }
}