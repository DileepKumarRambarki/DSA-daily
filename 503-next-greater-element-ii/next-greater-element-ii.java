class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!st.isEmpty()&&curr>=st.peek()){
                int popped=st.pop();
            }
            res[i%n]=st.isEmpty()?-1:st.peek();
            st.push(curr);
        }
       
        return res;
    }
}