class Solution {
    public int climbStairs(int n) {
        int mem[]=new int[46];
        return rec(n,mem);
    }
    int rec(int n,int[] mem){
        if(n==2||n==1){
            return n;
        }
        if(mem[n-1]==0){
            mem[n-1]=rec(n-1,mem);
        }
        if(mem[n-2]==0) mem[n-2]=rec(n-2,mem);

        return mem[n-1]+mem[n-2];
    }
}