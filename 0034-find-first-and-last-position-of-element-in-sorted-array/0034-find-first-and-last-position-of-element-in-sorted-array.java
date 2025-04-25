class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=firstOccurence(nums,target);
        ans[1]=lastOccurence(nums,target);
        return ans;
    }

    public static int firstOccurence(int[] a,int x){
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int m=(l+r)>>>1;
            if(x<a[m]){
                r=m-1;
            }else if(x>a[m]){
                l=m+1;
            }else{
                r=m-1;
                ans=m;
            }
        }
        return ans;
    }

    public static int lastOccurence(int[] a,int x){
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int m=(l+r)>>>1;
            if(x<a[m]){
                r=m-1;
            }else if(x>a[m]){
                l=m+1;
            }else{
                l=m+1;
                ans=m;
            }
        }
        return ans;
    }

}