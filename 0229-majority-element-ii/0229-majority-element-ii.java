class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;

        // initialize both element by -1 and there respective count to zero.
        int element1=0,element2=0;
        int count1=0,count2=0;

        // first for loop to which two element is possibly be the mejority element.
        for(int i=0;i<n;i++){
            
            // increment count1 for element 1
                if(element1==nums[i]){
                    count1++;
                }
            // increment count2 for element 2
                else if(element2==nums[i]){
                    count2++;
                }
            // add new element1 if count1 is 0.
                else if(count1==0){
                    element1=nums[i];
                    count1++;
                }
            
             // add new element1 if count1 is 0.
                else if(count2==0){
                    element2=nums[i];
                    count2++;
                }
            // decrement count if both element is not equal to given array element.
                else{
                    count1--;
                    count2--;
                }
        }

        List<Integer> result = new ArrayList<>();
                    count1=0;
                    count2=0;
                // counting the occurence of the elements
                    for(int i =0;i<n;i++){
                        if(element1==nums[i]){
                            count1++;
                        }else if(element2==nums[i]){
                            count2++;
                        }
                    }

            // add in the result list if they are mejority element.
            if(count1>n/3){
                result.add(element1);
            } 

            if(count2>n/3){
                result.add(element2);
            }
                // Sorting the mejority array
            if(result.size()==2 && result.get(0)>result.get(1)){
                int temp = result.get(0);
                result.set(0,result.get(1));
                result.set(1,temp);
            }

            return result;

    }
}



















