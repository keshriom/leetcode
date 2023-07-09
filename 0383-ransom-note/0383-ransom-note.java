class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            mp1.put(magazine.charAt(i),mp1.getOrDefault(magazine.charAt(i),0)+1);
        }
        Map<Character,Integer> mp2=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            mp2.put(ransomNote.charAt(i),mp2.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(char c:ransomNote.toCharArray())
        if(mp2.getOrDefault(c,0)>mp1.getOrDefault(c,0))
            return false;
        return true;
    }
}