class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorted=String.valueOf(charArray);//changing char to string
        
        if(!map.containsKey(sorted))
            map.put(sorted,new ArrayList<String>());
            
        //get the sorted value from the map and add it to that group
        map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}