class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=1;
        int j=n-1;
        int[] res=new int[n];
        while(i<n){
            res[i]=nums[j];
            i+=2;
            j--;
        }
        //when i is out of bound initialize it to 0
        i=0;
        while(i<n){
            res[i]=nums[j];
            i+=2;
            j--;
        }
        //transfer the value store in res to nums arrray
        for(int k=0;k<n;k++){
            nums[k]=res[k];
        }
    }
}