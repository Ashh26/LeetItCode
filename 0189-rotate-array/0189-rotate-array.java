class Solution {
    public void rotate(int[] nums, int k) {

            // solution-1 using reversal array algorithm
         int n = nums.length;

        // handle the case where k> array length n
        k = k%n;

        // reverse the entire element
        reverse(nums,0,n-1);

        // reverse the k element
        reverse(nums,0,k-1);

        // reverse the n-k array
        reverse(nums,k,n-1);

    }

    static void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

            // solution-2 simple rotate one by one 

    //    int n = nums.length;

    //    for(int i=0;i<k;i++){
    //      int first = nums[0];

    //     for(int j=0;j<nums.length-1;j++){
    //         nums[j] = nums[j+1];
    //     }
    //     nums[n-1] = first;

    //    }
    }
