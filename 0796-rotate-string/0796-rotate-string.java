class Solution {
    public boolean rotateString(String s, String goal) {
        // check if the two given string are of the  same lenght if not then return false
        if(s.length()!=goal.length()){
            return false;
        }

        // concatenate string s with itself
        String doubleS = s+s;

        // check if the string goal is present in the concatenated string doubleS if yes
        // then goal is rotation of s return it

        return doubleS.contains(goal);

    }
}