class Solution {
    public int repeatedStringMatch(String a, String b) {
        //---youtube------
        String str=a;//take copy of the string
        int count=1;
        int repeat=b.length()/a.length();//calculate how many times it repeat in the b string
        for(int i=0;i<repeat+2;i++){//+2 is used bcz if 1 string is added at the begining and 1 string is added at the ending
            //example : A=abcd B=cda here,len(b)/len(a) = 0 hga
            
            //base condition
            if(a.contains(b))
                return count;
            else{
                a+=str;
                count++;
            }
        }
        return -1;
    }
}