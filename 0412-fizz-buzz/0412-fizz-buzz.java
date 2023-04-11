class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)list.add("FizzBuzz");
            else if(i%3==0)list.add("Fizz");
            else if(i%5==0)list.add("Buzz");
            //String.valueOf(index) used to get the value at that index from the string
            else list.add(String.valueOf(i));
        }
        return list;
    }
}