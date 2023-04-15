class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuffer sb=new StringBuffer(s);
        return lcs(s,sb.reverse().toString());
    }
    //fuction to find the longest common subsequences
    public int lcs(String a ,String b){
        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0)//if length of string is zero
                    dp[i][j]=0;
                //comparing the last character of the string 
                else if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                //if last character is not equal then 1st time discard the last element of                      string a and then 2nd time discard the last element of string b and take                        maximum of the two value 

                else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        
        return dp[m][n];
        
    }
}