class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int curr=asteroids[i];
            if(curr>0){
                st.push(curr);
            }
            else{
                if(st.isEmpty()||st.peek()<0){
                    st.push(curr);
                    continue;
                }
                while(!st.isEmpty()&&st.peek()>0&&-curr>st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()&&-curr<st.peek()){
                    continue;
                }
                else if(!st.isEmpty()&&-curr==st.peek()){
                    st.pop();
                }
                else{
                    st.push(curr);
                }
            }
        }
       int res[]=new int[st.size()];
       int k=st.size()-1;
       while(!st.isEmpty()){
        res[k--]=st.pop();
       }
       return res;
    }
    void help(int curr,Stack<Integer> st){
        if(st.isEmpty()){
            st.push(curr);
            return;
        }
        int peek=st.peek();
        if((curr>=0&&peek>=0)||(curr<0&&peek<0)){
            st.push(curr);
            return;
        }
        else if((curr<0&&peek>0)){
            if(-curr>peek){
                st.pop();
                help(curr,st);
            }
            else if(-curr<peek){
                return;
            }
            else{
                st.pop();
                return;
            }
        }
        else if((curr>0)){
            // if(-peek>curr){
            //     return;
            // }
            // else if(-peek<curr){
            //     st.pop();
            //     help(curr,st);
            // }
            // else{
            //     st.pop();
            //     return;
            // }
            st.push(curr);
        }
    }
}