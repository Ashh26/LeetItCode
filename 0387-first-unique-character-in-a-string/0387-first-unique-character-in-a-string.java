class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();

        for(int i=0;i<n;++i){
            int found=0;

            for(int j=0;j<n;++j){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    found++;
                    break;
                }
            }
            if(found==0){
                return i;
            }
        }
        return -1;
    }
}