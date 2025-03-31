class Solution {
    public int[] countBits(int n) {
        int count[]=new int[n+1];
        count[0]=0;
        for(int i=1;i<=n;i++){
            int pow=(int)(Math.log(i)/Math.log(2));
            if(i==Math.pow(2,pow)){
                count[i]=1;
            }
            else{
                count[i]=1+count[i-(int)Math.pow(2,pow)];
            }
        }
        return count;
    }
}