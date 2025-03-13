class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        palindromicHelper(s,ans,0,new ArrayList<>());

        return ans;
    }

    static boolean isPalindrome(String s,int l,int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

   static void palindromicHelper(String s,List<List<String>> ans,int index,List<String> cur){
        if(index==s.length()){
            List<String> curCopy=new ArrayList<>(cur);
            ans.add(curCopy);
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                cur.add(s.substring(index,i+1));
                palindromicHelper(s,ans,i+1,cur);
                cur.remove(cur.size()-1); // backTracking
            }
        }

    }

}