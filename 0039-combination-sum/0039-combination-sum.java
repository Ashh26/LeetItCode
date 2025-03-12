class Solution {
    Set<List<Integer>> s=new HashSet<>();
    void getAllCombinations(int[] arr,int idx,int target,List<List<Integer>>ans,List<Integer> combin){
       if(target==0){
          if(!s.contains(combin)){
          ans.add(new ArrayList<>(combin));
          s.add(new ArrayList<>(combin));
          }
          return;
        }
       
        if(idx>=arr.length || target<0){
          return;
        }

        combin.add(arr[idx]);

        // for sigle inclusion
        getAllCombinations(arr,idx+1,target-arr[idx],ans,combin);

        // for multiple inclusion
        getAllCombinations(arr,idx,target-arr[idx],ans,combin);

        
        combin.remove(combin.size()-1);

        while(idx+1<arr.length && arr[idx]==arr[idx+1]){idx++;}
        
        // for exclusion
        getAllCombinations(arr,idx+1,target,ans,combin);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> combin=new ArrayList<>();

        getAllCombinations(candidates,0,target,ans,combin);
        return ans;
    }
}