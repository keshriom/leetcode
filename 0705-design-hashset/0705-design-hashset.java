class MyHashSet {
    boolean[] setArray;
    int size=(int)Math.pow(10,6)+1;
    public MyHashSet() {
        
        setArray=new boolean[size];
    }
    
    public void add(int key) {
        setArray[key]=true;//add true into the setArray
    }
    
    public void remove(int key) {
        setArray[key]=false;//means no element is present 
    }
    
    public boolean contains(int key) {
        return setArray[key];
    }
}
//TC:O(1)
//SC:O(10^6+1)=O(1)

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */