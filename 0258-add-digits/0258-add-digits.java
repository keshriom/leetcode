class Solution {
    public int addDigits(int num) {
        /*
        //----not more efficient
        if(num==0)return 0;
        int sum=0;
        String st=String.valueOf(num);
        for(int i=0;i<st.length();i++){
            sum+=st.charAt(i)-'0';
        }
        if(sum<10)// If  sum is less than 10, it is the digital root. Return it...
            return sum;
        else 
            return addDigits(sum);// Sum becomes the new number. Call the function again with sum as parameter...
            */
        //-----efficient way ---------
        //--divisibility by 9 algorithm-----
        if(num==0)return 0;
        else if(num%9==0)return 9;
        else
            return num%9;//if not divisible by 9 return then the num%9 will give u answer
    }
}