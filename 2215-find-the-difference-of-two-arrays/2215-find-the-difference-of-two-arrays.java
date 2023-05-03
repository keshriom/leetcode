class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        HashSet<Integer> set1=new HashSet<Integer>();
        for(int n:nums1)
            set1.add(n);

        HashSet<Integer> set2=new HashSet<Integer>();
        for(int m:nums2)
            set2.add(m);
        
       HashSet<Integer> common=new HashSet<Integer>();
             for(int val:set1){
                if(set2.contains(val))
                    common.add(val);
             }
        set1.removeAll(common);
        set2.removeAll(common);
       
       // converting hashset to arraylist 
        ArrayList<Integer> res1= new ArrayList<>(set1);
        ArrayList<Integer> res2= new ArrayList<>(set2);
        // adding 2 types of list in a single list of list
        res.add(res1);
        res.add(res2);
    return res;
    // return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));
    }
}