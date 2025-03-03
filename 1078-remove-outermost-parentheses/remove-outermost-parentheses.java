class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String res="";
        int first=0;
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                if(ch=='('){
                    left++;
                }
                else{
                    right++;
                }
                if(left==right){
                    String str=s.substring(first,i+1);
                    str=str.substring(1,str.length()-1);
                    res+=str;
                    first=i+1;
                    left=0;
                    right=0;
                }
            
        }
        return res;
    }
}