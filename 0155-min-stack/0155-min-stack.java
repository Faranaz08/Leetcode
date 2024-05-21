class MinStack {
    ArrayList<Integer> st=new ArrayList<>(); 
    int ptr=-1;
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.add(val);
        ptr++;
    }
    
    public void pop() {
        st.remove(ptr);
        ptr--;
    }
    
    public int top() {
        return st.get(ptr);
    }
    
    public int getMin() {
       return Collections.min(st);
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