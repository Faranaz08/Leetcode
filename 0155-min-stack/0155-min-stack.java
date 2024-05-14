class MinStack {
   Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.peek().equals(min.peek())){
            min.pop();
        }st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
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