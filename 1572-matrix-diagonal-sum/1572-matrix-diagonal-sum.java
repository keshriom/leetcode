class Solution {
    public int diagonalSum(int[][] mat) {
        int res=0;
        int row=mat.length;
        //traverse only in row
        for(int i=0;i<row;i++){
            //add the primary and secondary diagonal
            res+=mat[i][i]+mat[i][row-i-1];
        }
        //if the number appears twice(i.e.,centre) means if row is odd then we have to subtract the centre part from the res
        if(row%2==1)
            //row/2 gives u the centre element 
            res -=mat[row/2][row/2];
        return res;
    }
}