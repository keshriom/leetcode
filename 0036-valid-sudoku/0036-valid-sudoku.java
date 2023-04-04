class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++){//for row tarversal
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    // if the value is not be able to add then return false; 
                    if(!set.add("row"+i+board[i][j]) || !set.add("column"+j+board[i][j]))
                        return false; 
                    //calculating box index which is starting form 0 and ending to 8
                    int box_index= (i/3)*3+(j/3);
                    if(!set.add("box"+box_index+board[i][j]))
                        return false;       
                }
            }
            }
            return true;
    }
}