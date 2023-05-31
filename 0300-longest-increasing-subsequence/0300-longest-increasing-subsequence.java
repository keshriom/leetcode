class Solution {
    public int lengthOfLIS(int[] nums) {
     //pepcoding----------
        //tabulation method
        int n=nums.length;
        int[] dp=new int[n];
        int overall_maximum=0;
        for(int i=0;i<dp.length;i++){//dp.length=n
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(dp[j]>max){
                        max=dp[j];
                    }
                }
            }
            dp[i]=max+1;
            if(dp[i]>overall_maximum)
                overall_maximum=dp[i];
        }
        return overall_maximum;
    }
}