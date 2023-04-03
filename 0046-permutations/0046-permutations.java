class Solution {
    //-------------Striver---------------
//     1st approach where space compexity is more 
    private void recurPermute(int[] nums,List<List<Integer>> ans ,List<Integer> ds,boolean[] freq){//boolean[] freq is a map array
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){//the array map is empty then 
                freq[i]=true;//map it to true
                ds.add(nums[i]);//add the value in datastructue
                recurPermute(nums,ans,ds,freq);
                ds.remove(ds.size()-1);//remove the top element from the ds
                freq[i]=false;//and make it as false when moving back
        }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        recurPermute(nums,res,ds,freq);
        return res;
}
}