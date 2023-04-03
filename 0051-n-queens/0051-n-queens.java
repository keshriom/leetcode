class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
                List<List<String>> res=new ArrayList<List<String>>();
                dfs(0,board,res);
                return res;
    }
    //function to check whether the queen is placed at that index or not
    static boolean validate(char[][] board,int row,int col){
        //check upper diagonal
        int duprow=row;
        int dupcol=col;
        //kept on moving upwards
        while(row>=0 && col>=0){
            if(board[row][col]=='Q')return false;
            row--;
            col--;
        }   
            //check left horizontal
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q')return false;
            col--;
        }
        //check lower diagonal
        row=duprow;
        col=dupcol;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q')return false;
            col--;
            row++;
        }
        return true;
        }
        static void dfs(int col,char[][] board,List<List<String>> res){
            //base condition 
            if(col==board.length){
                res.add(construct(board));
                return;
            }
            for(int row=0;row<board.length;row++){
                //filling up of every column
                if(validate(board,row,col)){
                    board[row][col]='Q';
                    dfs(col+1,board,res);
                    board[row][col]='.';//when going back unmarked it
                }
            }
        }
    static List<String> construct(char[][] board){
        List<String> res=new LinkedList<String>();
        for(int i =0;i<board.length;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
    }