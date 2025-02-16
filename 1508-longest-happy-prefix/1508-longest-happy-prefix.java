class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int[] lps=new int[n]; // lps array
        int i=0; // Length of previous longest prefix suffix
        int j=1; // Start frome the second character

        while(j<n){
            if(s.charAt(j)==s.charAt(i)){ // Match found
                i++;
                lps[j]=i;
                j++;
            }else{
                if(i==0){ // if no element is found in this position
                    j++;
                }else{
                    i=lps[i-1]; // fallback to previous lps value
                }
            }
        }
        // longest prefix suffix is the substring of lps[n-1]
        return s.substring(0,lps[n-1]);
    }
}