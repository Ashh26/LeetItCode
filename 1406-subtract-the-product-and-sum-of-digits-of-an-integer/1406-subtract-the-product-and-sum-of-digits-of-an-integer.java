class Solution {
    public int subtractProductAndSum(int n) {
        int prd=1;
        int sum=0;
        while(n!=0){
            int digit = n%10;
            prd = prd*digit;
            sum+=digit;
            n = n/10;
        }
        return (prd-sum);
    }
}