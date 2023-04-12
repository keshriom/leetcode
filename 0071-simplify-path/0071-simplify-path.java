class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String res="";
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                continue;
            }
            String temp="";
            while(i<path.length() && path.charAt(i)!='/'){
                temp=temp + path.charAt(i);
                i++;
            }
                if(temp.equals("."))
                    continue;
                else if(temp.equals("..")) {
                       if(!st.isEmpty())
                
                        st.pop();
                 }
                 else
                     st.push(temp);
            }
        while(!st.isEmpty()){
            res="/"+st.peek()+res;
            st.pop();
        }
        if(res.length()==0)
            return "/";
        return res;
    }
}
