class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String res="";
        int first=0;
        st.push('(');
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(i>first && (i-first)%2==1&&st.size()==1){
                String str="";
                    str=s.substring(first,i+1);
                    first=i+1;
                str=str.substring(1,str.length()-1);
                res=res+str;
                }
                 char pp=st.pop();
            }
        }
        return res;
    }
}