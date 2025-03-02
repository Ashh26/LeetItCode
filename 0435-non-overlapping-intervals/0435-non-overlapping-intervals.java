class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int count=0;
        int i=0;
        int j=1;
        int n=intervals.length;

        while(j<n){
            int cs = intervals[i][0];
            int ce = intervals[i][1];
            int ns = intervals[j][0];
            int ne = intervals[j][1];

            if(ce<=ns){   // no overlapping
                i=j;
                j++;
            }else if(ce<=ne){  // overlapping
                j++;
                count++;
            }else if(ce>ne){   // overlapping
                i=j;
                j++;
                count++;
            }

        }
        return count;
    }
}