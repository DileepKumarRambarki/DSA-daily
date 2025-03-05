import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        String num=new String();
        int i=0,j=0;
        if(s.length()==0) return 0;
        if(s.charAt(0)=='+'){
            j++;
        }
        else if(s.charAt(0)=='-'){
            num+='-';
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
        BigInteger l=new BigInteger(num);
        
        if(l.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))>0){
            return Integer.MAX_VALUE;
        }
        else if(l.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))<0){
            return Integer.MIN_VALUE;
        }
        return l.intValue();
    }
}