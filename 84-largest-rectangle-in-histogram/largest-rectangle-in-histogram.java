class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int nextmin[]=new int[heights.length];
        int prevmin[]=new int[n];
        int res=0;
        for(int i=heights.length-1;i>=0;i--){
            int curr=heights[i];
            while(!st.isEmpty()&&curr<=heights[st.peek()]){
                st.pop();
            }
            nextmin[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<n;i++){
            int curr=heights[i];
            while(!st.isEmpty()&&curr<=heights[st.peek()]){
                st.pop();
            }
            prevmin[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        for(int i=0;i<heights.length;i++){
            int r=nextmin[i]==-1?n-i:nextmin[i]-i;
            int l=prevmin[i]==-1?i:i-prevmin[i]-1;
            int area=(r+l)*heights[i];
            res=Math.max(res,area);
        }
        return res;
    }
}