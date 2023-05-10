class Solution {
    public int[][] generateMatrix(int n) {
        //making a matrix of lenght n*n
        int[][] mat=new int[n][n];
        // int row=col=n;
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         mat[i][j]=0;
        //     }
        // }
        int top=0;//topmost left corner
        int left=0;//bottommost left corner
        int right=mat[0].length-1;//topmost right corner
        int bottom=mat.length-1;//bottommost right corner
        int num=1;
        while(top<=bottom && left<=right){
            //traverse left to right
            for(int i=left;i<=right;i++){
                mat[top][i]=num;
                num++;
            }
            top++;
            //traverse top to bottom
            for(int i=top;i<=bottom;i++){
                mat[i][right]=num;
                num++;
            }
            right--;
            //traverse right to left
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                mat[bottom][i]=num;
                num++;
            }
            bottom--;
            }
            //traverse bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    mat[i][left]=num;
                    num++;
                }
                left++;
            }
        } 
        return mat;   
    }
}