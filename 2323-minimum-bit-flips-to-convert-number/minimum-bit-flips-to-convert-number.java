class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int res=0;
        while(xor!=0){
            if((xor&1)==1){
                res++;
            }
            xor=xor>>1;
        }
        return res;
    }
}