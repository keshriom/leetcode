class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;//indicating the 1st row
        int left=0;//indicating the 1st col
        int right=matrix[0].length-1;//indicating the last col
        int bottom=matrix.length-1;//indicating the last row
        List<Integer> list =new ArrayList<>();
         while(top <= bottom && left <=right){
             //moving left to right
             for(int i=left;i<=right;i++)
                list.add(matrix[top][i]);
            top++;
            //moving top to bottom
            for(int i=top;i<=bottom;i++)
                list.add(matrix[i][right]);
            right--;
            //moving right to left
            if(top<=bottom){
            for(int i=right;i>=left;i--)
                list.add(matrix[bottom][i]);
            bottom--;
            }
            //moving bottom to top
            if(left<=right){
            for(int i=bottom;i>=top;i--)
                list.add(matrix[i][left]);
            left++;
            }
         } 
         return list;

    }
}