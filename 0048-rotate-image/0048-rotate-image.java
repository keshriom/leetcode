class Solution {
    public void rotate(int[][] a) {
        int n = a.length;//for finding the no. of rows
        //use n = a[0].length; to find the no. of columns
        //for finding the transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp =a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int j=0;
            int k=n-1;
            while(j<=k){
                int temp =a[i][j];
                a[i][j]=a[i][k];
                a[i][k]=temp;
                j++;
                k--;
            }
        }
    }
}