class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;

        int[] frq = new int[n+1];

        for(int i=0;i<n;i++){
            if(citations[i]>=n){
                frq[n]=frq[n]+1;
            }else{
                frq[citations[i]] = frq[citations[i]]+1;
            }
        }

        int index=n;
        int s=frq[n];
        while(s<index){
            index--;
            s=s+frq[index];
        }
        return index;
    }
}