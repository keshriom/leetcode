 class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
class Solution {
    //--------striver---
    public int numEnclaves(int[][] grid) {
        //making a queue to store the index of 1's for the  given matrix
        Queue<Pair> q=new LinkedList<Pair>();
        int n=grid.length;//no. of rows
        int m=grid[0].length;//no. of column
        int vis[][]=new int[n][m];//creating a visited matrix
        //visiting all the index of the grid
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //first row , first col ,nth row , nth col
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                }
            }
        }
        //direction of (i,j) to visit the neighbours
        int deltarow[]={-1,0,+1,0};
        int deltacol[]={0,+1,0,-1};
        
        while(!q.isEmpty()){
            int row=q.peek().first;//row number
            int col=q.peek().second;//col number
            q.remove();
            
            //traverse all 4 directions
            for(int i=0;i<4;i++){
                int nrow= row + deltarow[i];//neighbouring row
                int ncol= col + deltacol[i];//neighbouring col
                //checking boundary conditon
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }
        //count the no. of 1's present inside the grid 
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0)
                    count++;
            }
        }
        return count;
    }
}