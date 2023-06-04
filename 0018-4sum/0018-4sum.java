//striver----------------
class Solution {
    //brute force--
    //sort the array -> 3 pointer +binary search
    //and then use hashset to store the quadruplets
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0)return res;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long rem=(long)target-nums[j]-nums[i];
                int front=j+1;
                int back=n-1;
                while(front<back){
                    long two_sum=(long)nums[front]+nums[back];
                    if(two_sum<rem)front++;
                    else if(two_sum>rem)back--;
                    else{
                    List<Integer> ans=new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[front]);
                    ans.add(nums[back]);
                    res.add(ans);
                    
                    //checking for the duplicate element at number 3
                    while(front<back && nums[front]==ans.get(2))++front;
                    //checking for the duplicate element at number 4
                    while(front<back && nums[back]==ans.get(3))--back;
                    }
            }
                //checking for the duplicate element at number 2
                while(j+1<n && nums[j+1]==nums[j])++j;      
        }
                //checking for the duplicate element at number 1
                while(i+1<n && nums[i+1]==nums[i])++i;      
    }
        return res;
    }
}