class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //pepcoding--------------
        int[] dp=new int[s.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<=i;j++){
                String word_to_check=s.substring(j,i+1);
                if(wordDict.contains(word_to_check)){
                    if(j>0){
                    dp[i]+=dp[j-1];
                }
                else{
                    dp[i]+=1;
                }
         }
        }
        }
        //if last filled of dp is greater than 0 then it it true otherwise false
        return dp[s.length()-1]>0;
    }
}