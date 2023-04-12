/*class Solution {
    public int findDuplicate(int[] nums) {
        //-----------using HashMap ---
        //but it contains O(n) extra space for storing the key value pair in worst case
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])>1){
                return nums[i];
        }
        }
        return -1;
    }
}
*/
class Solution {
    public int findDuplicate(int[] nums) {
       // Floyd Cycle Detection algorithm  is used
        if(nums.length==0)return -1;
        int slow=nums[0],fast=nums[nums[0]];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}