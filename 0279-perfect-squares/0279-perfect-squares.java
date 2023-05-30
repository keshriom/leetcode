class Solution {
    //pepcoding----------
    public int numSquares(int n) {
        //dp tabulation method
        int[] dp=new int[n+1];
        dp[0]=0;//base condition
        dp[1]=1;//base condition
        for(int i=2;i<=n;i++){
            int min=Integer.MAX_VALUE;
            //for n=10 we use only 1^1 , 2^2 and 3^3 
            for(int j=1;j*j<=i;j++){
                int rem=i-j*j;//remaining
                if(dp[rem]<min){
                    min=dp[rem];
                }
            }
            dp[i]=1+min;
        }
        return dp[n];//return the corresponding value of n from the dp table
    }
}
/*you can use Legendre's 3-Square Theorem also
steps :-
1.If it's perfect square, return 1
2.If it satisfies 4^a (8b + 7), return 4
3.If it's sum of 2 perfect squares, return 2
4.Otherwise, return 3
*/