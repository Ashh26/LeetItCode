class Solution {
         int rev=0,reminder,temp; 
    public boolean isPalindrome(int x) {
             temp = x;
        while(temp!=0){
            
            reminder = temp%10;
            
            rev = rev*10+reminder;

             temp = temp/10;
        }

        if(rev==x && x>=0){
            return true;
        }else{
            return false;
        }

    }

}