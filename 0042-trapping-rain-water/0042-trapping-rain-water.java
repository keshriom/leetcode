class Solution {
    public int trap(int[] nums) {
        int leftindex=0;
        int rightindex=nums.length-1;
        int leftmax=0;
        int rightmax=0;
        int res=0;
        while(leftindex<=rightindex){
            if(nums[leftindex]<nums[rightindex]){
            if(nums[leftindex]>leftmax){
                leftmax=nums[leftindex];
            }
            else{
                res+=(leftmax-nums[leftindex]);
            }
            leftindex++;
        }
        else{
            if(nums[rightindex]>rightmax){
                rightmax=nums[rightindex];
            }
            else{
                res+=(rightmax-nums[rightindex]);
            }
            rightindex--;
        }
        }
        return res;

    }
}