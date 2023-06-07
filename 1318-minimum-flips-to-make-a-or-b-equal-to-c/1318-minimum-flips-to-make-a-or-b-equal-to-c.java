class Solution {
    public int minFlips(int a, int b, int c) {
        int flips=0;
        while(a>0 || b>0 ||c>0){
            int bitA= a & 1;//& opeartion is used to check the last bit is set(1) orunset(0) 
            int bitB= b & 1;
            int bitC= c & 1;
           //if last  bit of the resultant bit is 0  
            if(bitC==0){
                flips+=(bitA+bitB);// how many no.have to change to get the result bitC
            }
            else{ //if(bitC==1)
                if(bitA==0 && bitB==0){
                    flips+=1;//if both bitA and bitB is zero then change any bit to 1
                }
            }
            a>>=1;//shift the bitA to the next of last pointer so it becomes now last pointer
            b>>=1;
            c>>=1;
        }
        return flips;
    }
}