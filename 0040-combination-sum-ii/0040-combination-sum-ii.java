class Solution {

        //-----striver video-------
    //making a function findCombinations
    private void findCombinations(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                return;
        }
        //pick up the element
        for(int i =index;i<arr.length;i++){
            //if it is repeated element then not pick
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            //anything on the right cannot pick
            if(arr[i]>target){
                break;
            }
            ds.add(arr[i]);
            findCombinations(i+1, arr, target-arr[i],ans,ds);
            ds.remove(ds.size()-1);//remove the last element when backtrack because when we start we new index the ds should be empty or conatin the value in ds at that index
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target,ans,new ArrayList<>());
        return ans;
    }
}
