class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res=new ArrayList<String>();
        for(String word:words){
            if(check(word,pattern))
                res.add(word);
        }
        return res;
    }
    public boolean check(String a ,String b){
        for(int i=0;i<a.length();i++){
            char c1=a.charAt(i);
            char c2=b.charAt(i);
            //.indexOf() give the index number
            //if index number of the string is same return true else false
            if(a.indexOf(c1)!=b.indexOf(c2))
                return false;
        }
        return true;
    }
}