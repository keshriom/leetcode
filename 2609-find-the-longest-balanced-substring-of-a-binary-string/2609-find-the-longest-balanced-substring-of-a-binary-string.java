class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int p=0,q=0;
            int j=i;
            //checking for 0 only
           while(j<n){
               if(s.charAt(j)=='0')
                    p++;
                if(s.charAt(j)=='1')
                    break;
                j++;
           }
           int k=j;
           //checking for 1 only
           while(k<n){
               if(s.charAt(k)=='1')
                    q++;
                if(s.charAt(k)=='0')
                    break;
                if(p==q)
                    ans=Math.max(ans,(k-i+1));
                k++;
           }
        }
        return ans;
    }
}