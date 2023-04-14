class Solution {
    public boolean isSafe(int x,int y, int row,int col){
        return (x>=0 && x<row && y>=0 && y<col);//boundary condition
    }
    public void gameOfLife(int[][] board) {
        int row=board.length;
        int col=board[0].length;
        
        int[] dx={1,1,0,-1,-1,-1,0,1};
        int[] dy={0,-1,-1,-1,0,1,1,1};
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int lifecount=0;
                for(int k=0;k<8;k++)
                    if(isSafe(i+dx[k],j+dy[k],row,col) && Math.abs(board[i+dx[k]][j+dy[k]])==1)
                       lifecount++;
                       
            if(board[i][j]==0 && lifecount==3)
                board[i][j]=2;
            if(board[i][j]==1 && (lifecount<2 || lifecount>3))
                board[i][j]=-1;    
    }
}
            
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]>0)
                    board[i][j]=1;
                else
                    board[i][j]=0;
            }
            
        }
                       
                       
    }
    }