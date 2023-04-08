class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int res=nums[0];
        int count=1;
        int last=nums.length-1;
        int p=nums.length-1;
        for(int i=last;i>0;i--){
            if(nums[last]>=nums[last-1]){
                if(count==k){
                res=nums[p];
                }
                count++;
                p--;
            }
        }
        return res;
    }
}