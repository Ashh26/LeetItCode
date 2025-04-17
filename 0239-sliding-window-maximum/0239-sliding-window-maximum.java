class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int i=0;
        while(i<k){
            while(!dq.isEmpty() && dq.getLast()<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
            i++;
        }
        int n=nums.length;
        int[] ans=new int[n-k+1];
        for(;i<n;i++){
            ans[i-k]=dq.peekFirst();
            if(nums[i-k]==dq.peekFirst()){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && dq.getLast()<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
        }
        ans[n-k]=dq.peekFirst();
        return ans;
    }
}