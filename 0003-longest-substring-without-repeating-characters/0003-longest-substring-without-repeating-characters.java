class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int res=0;
        int i=0;
        int j=0;
        while(i<s.length()){
        if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i++));
            res=Math.max(res,set.size());
        }
            else{
                set.remove(s.charAt(j++));
            }
    }
        return res;
    }
}