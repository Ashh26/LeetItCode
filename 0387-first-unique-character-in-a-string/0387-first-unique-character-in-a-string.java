class Solution {
    public int firstUniqChar(String s) {
        int max_char = 26;
        int arr[] = new int[max_char];
        Arrays.fill(arr,-1);

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            if(arr[index]==-1){
                arr[index]=i;
            }else{
                arr[index]=-2;
            }
        }

        int idx=-1;

        for(int i=0;i<max_char;i++){
            if(arr[i]>=0 && (idx==-1 || arr[i]<arr[idx])){
                idx=i;
            }
        }
        
        return (idx==-1) ? -1: arr[idx];

    }
}