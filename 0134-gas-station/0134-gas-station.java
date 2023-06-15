class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current_fuel=0;  
        int start_index=0;
        int total_gas=0;//what we need 
        int total_cost=0;//what is there
        for(int i=0;i<gas.length;i++){
            total_gas+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            total_cost+=cost[i];
        }
        //need<what is there then return -1
        if(total_gas < total_cost)return -1;
        
        for(int i =0;i<gas.length;i++){
            current_fuel+=(gas[i]-cost[i]);
            if(current_fuel<0){
                start_index=i+1;
                current_fuel=0;
            }
        }
        return start_index;
    }
}