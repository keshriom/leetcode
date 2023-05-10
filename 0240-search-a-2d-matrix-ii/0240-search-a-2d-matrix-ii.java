class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==target)
                    return true;
            }
        }
        return false;
    }
}