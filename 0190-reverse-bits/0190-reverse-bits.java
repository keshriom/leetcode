public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;//(0 in 32 bit is 00000000000000000000000000000000)
        for(int i=0;i<32;i++){
        //we have to first have the number at the right hand side(least significant bit) of n
        int lsb =n & 1;//doing and operation with 1 (00000000000000000000000000000001)
        int reverselsb=lsb <<(31-i);//left shift the lsb by 31 times when i=0
        res=res | reverselsb;//taking or operation ,it will give u the first bit of the res
        n=n>>1;//right shift the value of n means if n=00000010100101000001111010011100 then by right shift by 1 n becomes 00000001010010100000111101001110
        }
        return res;
    }
}