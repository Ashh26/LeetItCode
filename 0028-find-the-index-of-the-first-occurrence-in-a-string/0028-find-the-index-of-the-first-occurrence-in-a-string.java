class Solution {
    public int strStr(String haystack, String needle) {
       if(needle.isEmpty()) return 0;

        int hl = haystack.length();
        int nl = needle.length();

        int hp = 0;
        int np = 0;

        while(hp<hl){
            if(haystack.charAt(hp)==needle.charAt(np)){
                if(nl==0) return hp;
                hp++;
                np++;
            }else{
                hp = hp-np+1;
                np=0;
            }

            if(np==nl){
                return hp-np;
            }  
        }

        return -1;

    }
}