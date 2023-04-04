class Solution {
    public void solveSudoku(char[][] board) {
     solve(board);   
    }
    public static boolean solve(char[][] board){
        //tarverse in the matrix
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){//if matrix is empty at that index
                    for(char c='1';c<='9';c++){
                        if(isValid(board,i,j,c)){//function to check is it valid or not
                                board[i][j]=c;//fill the index
                            
                                if(solve(board))//call again the solve function
                                    return true;
                                else
                                    board[i][j] ='.';//remove the element when it is false
                        }
                    }
                return false;
            }
            }
        }
        //everything is filled up in the sudoku and nothing is left to fill,so return true 
        return true;
    }
    public static boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[i][col]==c)//check for column
                return false;
            if(board[row][i]==c)//check for row
                return false;
            if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)//check for 3*3 box
                return false;
        }
        return true;
    }
}