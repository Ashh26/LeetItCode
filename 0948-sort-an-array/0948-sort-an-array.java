class Solution {
    // taking two arrays one to store original element second to copy the unsorted element
    int[] arr;
    int[] tempArray;
    int length;
    public int[] sortArray(int[] nums) {
        this.arr = nums;
        this.length = nums.length;
        this.tempArray = new int[length];

        // calling the divide array function
         divideArray(0,length-1);
        return arr;
    }

    public  void divideArray(int start,int end){
        if(start<end){
            // divide the array into two half 
            int middle = (start+end)/2;
            // sort the array of the left side
            divideArray(start,middle);
            // sort the array of the right side
            divideArray(middle+1,end);
            // now merge the array in sorted form
            mergeArray(start,middle,end);
        }
    }

     public  void mergeArray(int start,int middle,int end){
        // first copy all the element into the temp array
        for(int i=start;i<=end;i++){
            tempArray[i]=arr[i];
        }

        // copy these value so that the original value will not effect
        int i=start;
        int j=middle+1;
        int k=start;

        // now compare and sort the array
        while(i<=middle && j<=end){
            if(tempArray[i]<tempArray[j]){
                arr[k]=tempArray[i];
                i++;
            }else{
                arr[k]=tempArray[j];
                j++;
            }
            k++;
        }

        while(i<=middle){
            arr[k]=tempArray[i];
            k++;
            i++;
        }

    }

}