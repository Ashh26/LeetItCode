class Solution {

    // function for remove leading zeros in binary string
    // static String trimZero(String s){
    //     // find the position of '1'
    //     int firstOne = s.indexOf('1');

    //     return (firstOne==-1) ? "0" : s.substring(firstOne);

    // }

    public String addBinary(String a, String b) {
                // StringBuilder to store the result of binary sum
        StringBuilder result = new StringBuilder();
        
        // trim string if there any leading zeros
        // a = trimZero(a);
        // b = trimZero(b);
    
        // indices to iterate through the strings from the end to the start
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        
        // carry will be used for the addition if the sum of two bits is greater than 1
        int carry = 0;
        
        // while loop until all character are processed or there is no carry left
        while(indexA>=0 || indexB>=0 || carry>0){
            
            // if still within  the bounds of string a, add the numeric value of the bit to carry
            if(indexA>=0){
                carry = carry+a.charAt(indexA)-'0';
                indexA--; // decrement indexA
            }
            
            // if still within the bounds of string b, add the numeric value of the bit to carry
            if(indexB>=0){
                carry = carry+b.charAt(indexB)-'0';
                indexB--; // decrement indexB
            }
            
            // append the remainder of dividing carry by 2(either 0 or 1) to the result
            result.append(carry%2);
            
            // carry is updated to the quotient of dividing cary by 2 (either 0 or 1)
            carry = carry/2;
            
            
        }
        
        // since the bits were added from right to left, the result needs to be reversed
            // to match the correct order
            return result.reverse().toString();

    }
}