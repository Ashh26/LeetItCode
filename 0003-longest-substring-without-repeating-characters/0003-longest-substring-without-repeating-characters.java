class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int ans=0;
        while(r<s.length()){
            if(!map.containsKey(s.charAt(r)) || map.get(s.charAt(r))<l){
                ans = Math.max(ans,r-l+1);
            }else{
                l=map.get(s.charAt(r))+1;
            }
            map.put(s.charAt(r),r);
            r++;
        }
        return ans;
    }
}