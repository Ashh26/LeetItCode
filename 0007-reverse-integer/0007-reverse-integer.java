class Solution {
    public int reverse(int x) {
        long reverse=0; int reminder = 0;
        int temp = x;
        while(temp!=0){
            reminder = temp%10;
            reverse = reverse*10 + reminder;
            temp = temp/10;
        }
        return (reverse<Integer.MIN_VALUE || reverse>Integer.MAX_VALUE)? 0 : (int)reverse;
    }
}