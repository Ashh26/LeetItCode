class Solution {
    public int minInsertions(String s) {
    
        int inputLength = s.length();

        int[][] dp = new int[inputLength][inputLength];
        for(int i=inputLength-2;i>=0;i--){
            for(int j=i+1;j<inputLength;j++){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp[0][inputLength-1];
    }
}