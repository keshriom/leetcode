class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        //Collections.reverseOrder() gives max Priority Queue
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int n = matrix.length;
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(pq.size() < k){
                    pq.add(matrix[i][j]); 
                }else{ //equal to k
                    if(matrix[i][j] < pq.peek()){ //if incoming element is less than peek like  [[1,2],[1,3]]
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                }
            }
        }

        return pq.peek();
    }
}