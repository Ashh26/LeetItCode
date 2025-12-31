class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int numberOfString = strs.length;

        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<numberOfString;j++){
                if(strs[j].length()<=i || strs[j].charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }
}