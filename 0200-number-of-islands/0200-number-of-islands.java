class Solution {
    //dfs traversal
    public void mark_curr_islands(char[][] matrix,int x,int y,int r,int c){
        if(x<0 ||x>=r ||y<0 ||y>=c || matrix[x][y]!='1')//boundary case for matrix
            return ;//simply return
        matrix[x][y]='2';//mark the visited node as 2
        
        mark_curr_islands(matrix,x+1,y,r,c);//down
        mark_curr_islands(matrix,x,y+1,r,c);//right
        mark_curr_islands(matrix,x-1,y,r,c);//top
        mark_curr_islands(matrix,x,y-1,r,c);//left
    }
    public int numIslands(char[][] grid) {
        int row=grid.length;
        if(row==0){
            return 0;
        }
        int col=grid[0].length;
        int no_of_islands=0;
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                if(grid[i][j]=='1'){
                   mark_curr_islands(grid,i,j,row,col);
                    no_of_islands+=1;
                }
            }
        }
        return no_of_islands;
    }
}