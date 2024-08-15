class MinStack {
    ArrayList<Integer> arr=new ArrayList<>();
    int ptr=-1;
    public MinStack() {
        
    }
    
    public void push(int val) {
        arr.add(val);
        ptr++;
    }
    
    public void pop() {
        arr.remove(ptr);
        ptr--;
    }
    
    public int top() {
        return arr.get(ptr);
    }
    
    public int getMin() {
        return Collections.min(arr);
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