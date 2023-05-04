class Solution {
    public int addDigits(int num) {
        if(num==0)return 0;
        int sum=0;
        String st=String.valueOf(num);
        for(int i=0;i<st.length();i++){
            sum+=st.charAt(i)-'0';
        }
        if(sum<10)return sum;
        else 
            return addDigits(sum);
    }
}