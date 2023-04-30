class Solution {
    public int[][] merge(int[][] intervals) {
        //make an array of list
        List<int[]>res=new ArrayList<>();
        //if intervals length is 0 or intervals is null 
        if(intervals.length==0 || intervals==null)
            //then return empty interval
            return res.toArray(new int[0][]);
        
        //it is not mention that the intervals given is sorted or not 
        //like [[1,3],[8,10],[2,6],[15,18]]
        //so we have to first sort the intervals, then it becomes
        //  [[1,3],[2,6],[8,10],[15,18]]
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);//sorted in the ascending order
        
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        //lineraly iterate in the intervals
        for(int[] i:intervals){
            if(i[0]<=end){//checking the condition before merging
                end=Math.max(end,i[1]);//merging 
            }
            else{   //if not merging
                res.add(new int[]{start,end});//adding into the list
                //re-asssigning the value 
                start=i[0];
                end=i[1];
        }
        }
        //whatever the value of the start and end we add it to the data structue
        res.add(new int[]{start,end});
        //once merging is completed then convert it into the array
        return res.toArray(new int[0][]);
        
    }
}