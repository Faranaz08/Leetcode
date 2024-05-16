class MinStack {
   ArrayList<Integer> lst=new ArrayList<>();
    int ptr=-1;
    public MinStack() {
        
            
            
    }
    
    public void push(int val) {
        lst.add(val);
        ptr++;
    }
    
    public void pop() {
        lst.remove(ptr);
        ptr--;
    }
    
    public int top() {
        return lst.get(ptr);
    }
    
    public int getMin() {
        return Collections.min(lst);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */