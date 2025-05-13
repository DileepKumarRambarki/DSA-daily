class MyQueue {

        Stack<Integer> p=new Stack<>();
        Stack<Integer> q=new Stack<>();
    public MyQueue() {
    }
    
    public void push(int x) {
        p.push(x);
    }
    
    public int pop() {
       if(q.isEmpty()){
        while(!p.isEmpty()){
            q.push(p.pop());
        }
       }
       return q.pop();
    }
    
    public int peek() {
       if(q.isEmpty()){
        while(!p.isEmpty()){
            q.push(p.pop());
        }
       }
       return q.peek();
    }
    
    public boolean empty() {
        return p.isEmpty()&&q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */