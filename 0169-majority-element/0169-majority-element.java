class Solution {
    public int majorityElement(int[] nums) {
        //brute force-------------------------------
    // int ansindex =0;
    // int count =1;
    // for(int i=1;i<nums.length;i++){
    //     if(nums[i]==nums[ansindex]){
    //         count++;
    //     }
    //     else
    //     {
    //         count--;
    //     }
    //     if(count==0){
    //         ansindex =i;
    //         count = 1;
    //     }
    // }
    // return nums[ansindex];
        
        //moore voting algorithm=-----------------------
        int ele=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                count++;
            }
            else {
                count--;
            }
        }
        //iterating through the nums array 
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele)count1++;
        }
        if(count1 >(nums.length/2))
            return ele;
        return -1;
    }
}