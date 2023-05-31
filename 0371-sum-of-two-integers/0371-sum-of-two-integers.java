class Solution {
    public int getSum(int a, int b) {
        //step1 : xor
        //step2: & <<1 ;
        while(b!=0){
            int temp= (a&b)<<1;
            a=a^b;
            b=temp;
        }
        return a;
    }
}