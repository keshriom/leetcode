class Solution {
    public int firstUniqChar(String s) {
        //Creating a hashmap
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);//take every character and note its occurrence.
        }
        for(int i=0;i<s.length();i++){
            //get the index which contain value 1 as a frequency 
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}