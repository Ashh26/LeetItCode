class Solution {
    public List<String> letterCombinations(String digits) {
         if (digits.isEmpty())  return new ArrayList<>();
        String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans = new ArrayList<>();
        letterCombinationsHelper(digits,map,0,ans,"");
        return ans;
    }

        public void letterCombinationsHelper(String digits,String map[],int index,ArrayList<String>ans,String cur){
            if(index==digits.length()){
                ans.add(cur);
                return;
            }
            int keypadnumber = digits.charAt(index)-'0';
            String keypadstring = map[keypadnumber];

            for(int i=0;i<keypadstring.length();i++){
                // cur = cur + keypadstring.charAt(i);
                letterCombinationsHelper(digits,map,index+1,ans,cur+keypadstring.charAt(i));
                // cur = cur.substring(0,cur.length()-1);
            }

        }

}