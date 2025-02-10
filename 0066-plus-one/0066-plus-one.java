class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;

       for(int i=n-1;i>=0;i--)
       {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
       }

       int newDigits[] = new int[n+1]; // if all element in array is 9 we need new array with  one extra space
       newDigits[0]=1;  // 999+1 = 1000
       return newDigits;

    }
}