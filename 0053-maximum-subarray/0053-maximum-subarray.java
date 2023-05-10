class Solution {
    //Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int cursum =0;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            ans = Math.max(ans,cursum);
            if(cursum<0) cursum=0 ;
        }
        //if(ans==0)return -1;
        return ans;
    }
}