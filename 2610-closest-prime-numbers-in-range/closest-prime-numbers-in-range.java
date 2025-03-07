class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[]=isPrime(right);
        int ans[]=new int[]{-1,-1};
        int res=Integer.MAX_VALUE;
       int a=-1,b=-1;
        for(int i=left;i<=right;i++){
            if(prime[i]){
                if(a!=-1&&(i-a)<res){
                    res=i-a;
                    ans[0]=a;
                    ans[1]=i;
                }
                a=i;
            }
        }
        return ans;
    }
    boolean[] isPrime(int n){
        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        return prime;
    }
}