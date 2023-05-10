class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        //one solution 
        /*int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==target)
                    return true;
            }
        }
        return false;
   */
        //second solution 
        if(mat.length==0 ||mat[0].length==0 ||mat==null)
            return false;
        //search from topmost right corner
        int row=0;
        int col=mat[0].length-1;
        while(row<=mat.length-1 && col>=0){
            if(target==mat[row][col])
                return true;
            else if(target<mat[row][col])
                 col--;
            else 
                row++;
        }
        return false;
   }
}