class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] ps=preSmaller(heights);
        int[] ns=nextSmaller(heights);

        int max=0;
        
        for(int i=0;i<n;i++){
            int cur=(ns[i]-ps[i]-1)*heights[i];
            max = Math.max(max,cur);
        }
        return max;
    }

    static int[] preSmaller(int[] a){
        int n=a.length;
        int[] ans=new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && a[stack.peek()]>=a[i]){
                stack.pop();
            }
            ans[i]=stack.isEmpty() ? -1:stack.peek();
            stack.push(i);
        }
        return ans;
    }

    static int[] nextSmaller(int[] a){
        int n=a.length;
        int[] ans=new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && a[stack.peek()]>=a[i]){
                stack.pop();
            }
            ans[i]=stack.isEmpty() ? n:stack.peek();
            stack.push(i);
        }
        return ans;
    }

}