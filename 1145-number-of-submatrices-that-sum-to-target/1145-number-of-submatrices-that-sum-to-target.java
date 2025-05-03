class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=1;j<col;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<col;i++){
            for(int j=i;j<col;j++){
                int sum=0;
                map.clear();
                map.put(0,1);
                for(int k=0;k<row;k++){
                    sum+=(matrix[k][j]-(i>0 ? matrix[k][i-1]:0));
                    int freq=map.getOrDefault(sum-target,0);
                    ans+=freq;
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
            }
        }
        return ans;
    }
}