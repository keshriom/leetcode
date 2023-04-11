class Solution {
    public String removeStars(String s) {
       // In string delete function is not there so use StringBuilder
      StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*')
                //delete the element from the last
                sb.deleteCharAt(sb.length()-1);
            else
                //else add the element in the sb
                sb.append(s.charAt(i));
        }
        return sb.toString();//to return in the form of a string
    }
}