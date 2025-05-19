class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            System.out.println(st);
            monotonic(nums2[i],st);
            if(st.isEmpty()){
                hm.put(nums2[i],-1);
            }
            else{
                if(st.peek()==nums2[i]){
                    int popped=st.pop();
                    hm.put(nums2[i],st.isEmpty()?-1:st.peek());
                    st.push(popped);
                }
                else{
                    hm.put(nums2[i],st.peek());
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
    }
    void monotonic(int n,Stack<Integer> st){
        if(st.isEmpty()){
            st.push(n);
        }
        else if(n<st.peek()){
            st.push(n);
        }
        else{
            while(!st.isEmpty()&&n>=st.peek()){
                int popped=st.pop();
            }
            st.push(n);
        }
    }
}