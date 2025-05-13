class MyStack {

        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> p=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        int n=q.size();
        for(int i=0;i<n-1;i++){
            p.offer(q.poll());
        }
        int popped=q.poll();
        for(int i=0;i<n-1;i++){
            q.offer(p.poll());
        }
        return popped;
    }
    
    public int top() {
        int n=q.size();
        for(int i=0;i<n-1;i++){
            p.offer(q.poll());
        }
        int popped=q.poll();
        for(int i=0;i<n-1;i++){
            q.offer(p.poll());
        }
        q.offer(popped);
        return popped;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */