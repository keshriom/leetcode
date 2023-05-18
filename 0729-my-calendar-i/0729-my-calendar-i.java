class MyCalendar {
    List<int[]>res;
    public MyCalendar() {
        res=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int i[]:res){
        if(start<i[1] && end>i[0])
            return false;
        }
    res.add(new int[]{start,end});
    return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */