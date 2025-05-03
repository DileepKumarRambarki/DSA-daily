class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1) return 0;
      boolean prime[]=new boolean[n];
      Arrays.fill(prime,true);
      prime[0]=false;
      prime[1]=false;
      for(int i=2;i<=(int)Math.sqrt(n);i++){
        if(prime[i]){
            for(int j=i*i;j<n;j+=i){
                prime[j]=false;
            }
        }
      }  
      int res=0;
      for(boolean b:prime){
        if(b) res++;
      }
      return res;
    }
}