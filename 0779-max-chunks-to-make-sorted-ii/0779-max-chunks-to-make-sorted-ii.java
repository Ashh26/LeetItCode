class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int[] maxLeft=new int[n];
        int[] minRight=new int[n];

        maxLeft[0]=arr[0];
        for(int i=1;i<n;i++){
            maxLeft[i]=Math.max(maxLeft[i-1],arr[i]);
        }

        minRight[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            minRight[i]=Math.min(minRight[i+1],arr[i]);
        }

        int chunks=0;
        for(int i=0;i<n-1;i++){
            if(maxLeft[i]<=minRight[i+1]){
                chunks++;
            }
        }
        return chunks+1;
    }
}