class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        List<String> path=new ArrayList<>();
        func(0,s,path,res);
        return res ;
    }
    public void func(int index,String s,List<String> path,List<List<String>> res){
        //base condition
        if(index==s.length()){
            res.add(new ArrayList<>(path));
            return;
    }
        //try to partition from the index
        for(int i=index;i<s.length();i++){
            //checking from index to i that is it palindrome or not
            if(isPalindrome(s,index,i)){
                //then add the substring into the path
                path.add(s.substring(index,i+1));
                func(i+1,s,path,res);
                //while backtacking u have to remove the element
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
}