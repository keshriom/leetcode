class Solution {
    public int arraySign(int[] nums) {
    //     int prod=1;
    //     for(int i=0;i<nums.length;i++){
    //         prod*=signFunc(nums[i]);
    //     }
    //     return prod;
    // }
    //     public int signFunc(int x){
    //     if(x>0)return 1;
    //     else if(x<0)return -1;
    //     else return 0;
        
        //-------with the help of count
        int count=0;
        for(int num:nums){
            if(num==0)return 0;
            else if(num<0)count++;
        }
        return count%2==0?1:-1;
    }
}