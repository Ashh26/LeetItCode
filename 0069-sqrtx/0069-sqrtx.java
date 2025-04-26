class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int l=1,r=x,ans=-1;
        while(l<=r){
            int mid=(l+r)>>>1;
            long square = (long)mid*mid;
            if(square==x) return mid;
            if(x<square){
                r=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}