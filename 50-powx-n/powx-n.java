class Solution {
    public double myPow(double x, int n) {
        if(x==1||n==1) return x;
        if(n==0) return 1;
        double ans=1;
        if(n>0) return recpow(x,n);
        if(n==Integer.MIN_VALUE ){
            ans*=x;
            n++;
        }
        ans*=recpow(x,-n);
        return 1/ans;
        
    }
    double recpow(double x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n%2==1) return x*recpow(x,n-1);
        return recpow(x*x,n/2);
    }
}