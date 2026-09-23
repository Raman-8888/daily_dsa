class MinStack {

    Stack<Integer>st=new Stack<>();
    Stack<Integer>MinSt=new Stack<>();
    int min=Integer.MAX_VALUE;
    public MinStack() {

        
    }
    
    public void push(int value) {


        st.push(value);

        if(MinSt.isEmpty() || value<=MinSt.peek())
        {
            MinSt.push(value);
        }
        else
        {
            MinSt.push(MinSt.peek());
        }


        
    }
    
    public void pop() {
        if(!st.isEmpty())
        {
            st.pop();
            MinSt.pop();
        }
        
    }
    
    public int top() {
       return  st.peek();
    }
    
    public int getMin() {
        

       return MinSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */