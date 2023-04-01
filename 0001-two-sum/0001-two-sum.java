class Solution {
    public int[] twoSum(int[] nums, int target) {
       int result[] =new int[2];
       Map<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           if(mp.containsKey(target-nums[i])){
               result[1]=i;
               result[0]=mp.get(target-nums[i]);
               return result;
           }
           else{
                mp.put(nums[i],i);   
           }
       }
           return result;
    }
}
 // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //        int t = nums[j]+nums[i];
        //         if(target == t) {
        //             return new int[]{i,j};
        //         }
        
        //     }
           
        // }
        // return null;