class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }

        int minVal=Integer.MAX_VALUE;
        int maxVal=-Integer.MAX_VALUE;
        
        for(int v:nums){
            minVal=Math.min(minVal,v);
            maxVal=Math.max(maxVal,v);
        }

        int bucketSize=Math.max(1,(maxVal-minVal)/(n-1));
        int bucketCount=(maxVal-minVal)/bucketSize+1;

        int[][] buckets=new int[bucketCount][2];

        for(int[] bucket:buckets){
            bucket[0]=Integer.MAX_VALUE;
            bucket[1]=-Integer.MAX_VALUE;
        }

        for(int v:nums){
            int idx=(v-minVal)/bucketSize;
            buckets[idx][0]=Math.min(buckets[idx][0],v);
            buckets[idx][1]=Math.max(buckets[idx][1],v);
        }

        int preMax=Integer.MAX_VALUE;
        int result=0;

        for(int[] bucket:buckets){
            if(bucket[0]>bucket[1]){
                continue;
            }
            result=Math.max(result,bucket[0]-preMax);
            preMax=bucket[1];
        }
        return result;
    }
}