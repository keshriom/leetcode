class Solution {
    public int uniquePaths(int m, int n) {
        //by techdose using dp
        //here we r moving from star to robot (oppositely) then we have only two movements
        //either u move left or top
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //first row and first col should have only one movement possible 
                //the row can move only in left and the col can move only in top
                if(i==0 || j==0)
                    dp[i][j]=1;
                else 
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        //return the last dp value 
        return dp[m-1][n-1];
    }
}