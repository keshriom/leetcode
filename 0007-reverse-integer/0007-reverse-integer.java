class Solution {
    public int reverse(int x) {
        long res=0;
        int last_digit=0;
        while(x!=0){
            last_digit=x%10;
            res=res*10+last_digit;
            x=x/10;
        }
        if(res<=Integer.MAX_VALUE && res>=Integer.MIN_VALUE)
            return (int)res;
        return 0;
    }
}