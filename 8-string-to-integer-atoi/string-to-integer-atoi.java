import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        String num=new String();
        int i=0,j=0;
        if(s.length()==0) return 0;
        int sign=0;
        if(s.charAt(0)=='+'){
            sign=0;
            j++;
        }
        else if(s.charAt(0)=='-'){
            sign=1;
            j++;
        }
        int dig=0;
        for(i=j;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                num+=ch;
                dig++;
            }
            else{
                break;
            }

        }
        if(num.length()==0) return 0;
        if(dig==0) return 0;
        long res=0;
        for(int k=0;k<num.length();k++){
            int digit=num.charAt(k)-'0';
            res=(res*10)+digit;
            if(sign==0&& res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==1&& -res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return sign==0?(int)res:-(int)res;
    }
}