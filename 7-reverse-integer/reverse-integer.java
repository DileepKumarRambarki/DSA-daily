class Solution {
    public int reverse(int x) {
        long res=0;
        long num=x;
        if(num<0){
            num=-num;
        }
        for(long i=num;i>0;i=i/10){
            long digit=i%10;
            res=(res*10)+digit;
            
        }
        if(x<0 && -res>=Integer.MIN_VALUE){
            return (int)-res;
        }
        else if(num>0&& res<=Integer.MAX_VALUE){
            return (int)res;
        }
        return 0;
    }
}