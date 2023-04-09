class Solution {
    public List<List<Integer>> generate(int numRows) {
        /* to calculate the given value in the pascal's triangle where r is row and c is column 
        using combination formula>>>>>>>>
        r-1
            C
             c-1
        */
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> row,pre=null;//taking row and previous row as a list
        for(int i=0;i<numRows;i++){
            row =new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 ||j==i) row.add(1);
                else row.add(pre.get(j-1)+pre.get(j));
            }
            pre=row;
            res.add(row);
        }
        return res;
    }
} 