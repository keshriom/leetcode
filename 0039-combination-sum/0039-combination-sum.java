class Solution {
    //-----striver video-------
    //making a function findCombinations
    private void findCombinations(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
             return;
        }
        //pick up the element
        if(arr[index]<=target){
            ds.add(arr[index]);
            findCombinations(index, arr, target-arr[index],ans,ds);
            ds.remove(ds.size()-1);//remove the last element when backtrack because when we start we new index the ds should be empty or conatin the value in ds at that index
        }
        findCombinations(index+1, arr, target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        findCombinations(0, candidates, target,ans,new ArrayList<>());
        return ans;
    }
}