class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2)return s;
        int max_len=1,len=0;
        int start=0,end=0;
        //odd length
        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i;
            while(left>=0 && right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }else{
                    break;
                }
                len =right-left-1;
                if(len>max_len){
                    max_len=len;
                    start=left+1;
                    end=right-1;
                }    
            }
        }
        //even length
        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i+1;
            while(left>=0 && right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }else{
                    break;
                }
                len =right-left-1;
                if(len>max_len){
                    max_len=len;
                    start=left+1;
                    end=right-1;
                }    
            }
        }
        //2nd parameter doesnot takes the end value so we are adding +1 to it
        return s.substring(start,end+1);
    }
}