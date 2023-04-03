class Solution {
    //-------------Striver---------------
//     1st approach where space compexity is more which is O(n)*O(n)
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
// ----Approach 2 which is efficient in space complexity which take O(n!)
// private void recurPermute(int index, int[] nums, List < List < Integer >> ans) {
//         if (index == nums.length) {
//             // copy the ds to ans
//             List < Integer > ds = new ArrayList < > ();
//             for (int i = 0; i < nums.length; i++) {
//                 ds.add(nums[i]);
//             }
//             ans.add(new ArrayList < > (ds));
//             return;
//         }
//         for (int i = index; i < nums.length; i++) {
//             swap(i, index, nums);
//             recurPermute(index + 1, nums, ans);
//             swap(i, index, nums);
//         }
//     }
//     private void swap(int i, int j, int[] nums) {
//         int t = nums[i];
//         nums[i] = nums[j];
//         nums[j] = t;
//     }
//     public List < List < Integer >> permute(int[] nums) {
//         List < List < Integer >> ans = new ArrayList < > ();
//         recurPermute(0, nums, ans);
//         return ans;
//     }
// }