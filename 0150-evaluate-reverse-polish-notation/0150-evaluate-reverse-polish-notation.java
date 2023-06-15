class Solution {
    public int evalRPN(String[] tokens) {
    int a,b;
		Stack<Integer> S = new Stack<Integer>();
		for (String s : tokens) {
			if(s.equals("+")) {
				S.add(S.pop()+S.pop());
			}
			else if(s.equals("/")) {
				b = S.pop();
				a = S.pop();
				S.add(a / b);
			}
			else if(s.equals("*")) {
				S.add(S.pop() * S.pop());
			}
			else if(s.equals("-")) {
				b = S.pop();
				a = S.pop();
				S.add(a - b);
			}
            //when number appears 
            //but the appears in the terms of string we need to convert it into the integer
            //use Integer.parseInt() method to convert the string into integer
			else {
				S.add(Integer.parseInt(s));
			}
		}	
		return S.pop();
    }
}