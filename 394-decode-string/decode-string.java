class Solution {
    public String decodeString(String s) {
        StringBuilder sb=new StringBuilder(s);
        decode(sb);
        return sb.toString();
    }
    void decode(StringBuilder sb){
        int loop=0;
        int left=0,right=0;
        int lc=0;
        int count=0;
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='['){
                loop=1;
                left=i;
            }
            else if(ch==']'){
                right=i;
                break;
            }
        }
        if(loop==0) return;
        // calculating k
        int j=left-1;
        while(j>=0){
            char ch=sb.charAt(j);
            if(ch>='0'&&ch<='9'){
                lc=j;
            }
            else{
                break;
            }
            j--;
        }
        count=Integer.parseInt(sb.substring(lc,left).toString());
        String sub=sb.substring(left+1,right);
        String substr="";
        for(int i=0;i<count;i++){
            substr=substr.concat(sub);
        }
        sb.replace(lc,right+1,substr);
        decode(sb);
    }
}