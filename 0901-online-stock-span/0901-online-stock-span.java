class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> li;
    public StockSpanner() {
        st = new Stack<>();
        li = new ArrayList<>();
        
    }
    
    public int next(int price) {
        li.add(price);
        
        while(!st.isEmpty() && li.get(st.peek())<=price){
            st.pop();
        }
        
        int previousGreaterIndex =(st.isEmpty() ? -1 : st.peek());
        int currentIndex=li.size()-1;
        int ans=currentIndex - previousGreaterIndex;
        st.push(currentIndex);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */