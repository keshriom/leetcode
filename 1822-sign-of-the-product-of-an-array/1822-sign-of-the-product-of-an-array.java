class Solution {
    public int arraySign(int[] nums) {
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=signFunc(nums[i]);
        }
        return prod;
    }
        public int signFunc(int x){
        if(x>0)return 1;
        else if(x<0)return -1;
        else return 0;
    }
}