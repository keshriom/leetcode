// i = 1: st = [1] ,l=0, popped[l]=4
// i = 2: st = [1, 2] ,l=0, popped[l]=4
// i = 3: st = [1, 2, 3] ,l=0, popped[l]=4
// i = 4: st = [1, 2, 3, 4],l=0, popped[l]=4
// pop: st = [1, 2, 3] ,l=1, popped[l]=5
// i = 5: st = [1, 2, 3, 5], l=1, popped[l]=5
// pop: st = [1, 2, 3], l=2, popped[l]=3
// pop: st = [1, 2], l=3, popped[l]=2
// pop: st = [1], l=4, popped[l]=1
// pop: st = [], l = 5, sequence is valid
// return st.empty()->true

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<Integer>();
        int i=0;
        for(int val:pushed){
            st.push(val);
            while(!st.isEmpty() && st.peek()==popped[i]){
                st.pop();
                i++;
            }
        }
        return st.isEmpty();
    }
}