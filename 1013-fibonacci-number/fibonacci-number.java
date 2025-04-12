class Solution {
    public int fib(int n) {
        int res[]=new int[n+1];
        return f(n,res);
    }
    int f(int n,int res[]){
        if(n==0||n==1) {
            res[n]=n;
            return res[n];
        }
        if(res[n]!=0) return res[n];
        else{
            res[n]=f(n-1,res)+f(n-2,res);
        }
        return res[n];
    }
}