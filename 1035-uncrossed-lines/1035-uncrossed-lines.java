class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
       //by techdose 
        //using dp -> tabulation method
        int n1=nums1.length;
        int n2=nums2.length;
        int[][] dp=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                //zeroth row and zeroth col should be zero always in the table
                if(i==0 || j==0)
                    dp[i][j]=0;
                
                else if(nums1[i-1]==nums2[j-1])
                    dp[i][j]=1+dp[i-1][j-1];
                else 
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);//max of top and left
            }
        }
        //return the last value of the table which gives u the max value 
        return dp[n1][n2];
        //TC:O(n*m)
    }
}