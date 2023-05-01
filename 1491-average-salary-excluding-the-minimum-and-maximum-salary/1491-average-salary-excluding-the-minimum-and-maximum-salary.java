class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length-1;
        double avg=0.00;
        int min=salary[0];
        int max=salary[n];
        double res=0,count=0;
        for(int i=1;i<n;i++){
            res+=salary[i];
            count++;
        }
        avg=res/count;
        return avg;
    }
}
//without sorting we can do ---
//firt take min and max salary ,
//then calculate the sum of the salary 
//then subtarct the min and max value from the sum 
//and then return avg =sum/length-2
//-2 is because of min and max terms