class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }

        int hayStackLength = haystack.length();
        int needleLength = needle.length();

        int hayStackPointer=0;
        int needlePointer=0;

        while(hayStackPointer<hayStackLength){
            if(haystack.charAt(hayStackPointer)==needle.charAt(needlePointer)){
                if(needleLength==1){
                    return hayStackPointer;
                }
                hayStackPointer++;
                needlePointer++;
            }else{
                hayStackPointer -= needlePointer-1;
                needlePointer=0;
            }

            if(needlePointer==needleLength){
                return hayStackPointer-needlePointer;
            }
        }
        return -1;
    }
}