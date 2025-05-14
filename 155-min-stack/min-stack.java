class MinStack {
        Stack<Integer> s;
        Stack<Integer> minstack;
    public MinStack() {
        s=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minstack.isEmpty()||val<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        int popped=s.pop();
        if(!minstack.isEmpty()&&popped==minstack.peek()){
            popped=minstack.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
       return minstack.peek();
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