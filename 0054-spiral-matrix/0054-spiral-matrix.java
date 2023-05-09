class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;//topmost left corner
        int left=0;//bottommost left corner
        int right=matrix[0].length-1;//topmost right corner
        int bottom=matrix.length-1;//bottommost right corner
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