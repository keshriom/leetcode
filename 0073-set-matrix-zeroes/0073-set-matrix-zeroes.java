class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1;//set the column as 1
        int rows=matrix.length;//no. of rows
        int cols=matrix[0].length;//no. of columns

        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0) col0=0;//if any of the rows is 0 in 1st col then set it to 0
            for(int j=1;j<cols;j++){
                if(matrix[i][j]== 0)
                    matrix[i][0]=matrix[0][j]=0;
            }
        }
        //traverse from the back side
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=1;j--)
                if(matrix[i][0] ==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            if(col0==0) matrix[i][0]=0;
        }

    }
}