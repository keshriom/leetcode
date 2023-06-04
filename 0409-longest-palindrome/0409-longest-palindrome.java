class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<Character>();
        int count=0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                count+=2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }
        if(set.size()>0)
            return count+1;
        return count;
    }
}