class Solution {
    public boolean isHappy(int n) {
        //------using Hashset 
        Set<Integer> set=new HashSet<>();
        set.add(n);
        while(n!=1){
            int res=0;
            while(n!=0){
                //n%10 gives u the last digit
                res+=Math.pow(n%10,2);
                n=n/10;//gives u the value of n except the last digit
            }
            if(set.contains(res)){
                return false;
            }
            set.add(res);
            n=res;  // Update n with the sum of the squares of its digits
        }
        return n==1;
    }
}