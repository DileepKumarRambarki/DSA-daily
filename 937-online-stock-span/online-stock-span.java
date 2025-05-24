class StockSpanner {
    Stack<Node> st;
    int top;
    public StockSpanner() {
        st=new Stack<>();
        top=1;
    }
    
    public int next(int price) {
        Node n=new Node(top,price);
        while(!st.isEmpty()&&n.price>=st.peek().price){
            st.pop();
        }
        int span=st.isEmpty()?top:top-st.peek().ind;
        st.push(n);
        top++;
        return span;
    }
}
class Node{
    int ind;
    int price;
    Node(int ind,int price){
        this.ind=ind;
        this.price=price;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */