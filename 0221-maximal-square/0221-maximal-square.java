class Solution {
    public int maximalSquare(char[][] matrix) {
        int row=matrix.length;
        if(row==0) return 0;
        int col=matrix[0].length;
        int maxArea=0;
        int[] histo=new int[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='0'){
                    histo[j]=0;
                }else{
                    histo[j]++;
                }
            }
            int curArea=histogram(histo);
            maxArea=Math.max(maxArea,curArea);
        } 
        return maxArea;
    }

    static int histogram(int[] heights){
        int n=heights.length;
        int[] ps=preSmaller(heights);
        int[] ns=nextSmaller(heights);

        int max=0;

        for(int i=0;i<n;i++){
            int width=ns[i]-ps[i]-1;
            int side=Math.min(heights[i],width);
            int area = side*side;
            max=Math.max(max,area);
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