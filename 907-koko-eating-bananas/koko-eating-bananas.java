class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1,high=piles[piles.length-1];
        int rate=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            long hrs=hours(piles,mid);
            if(hrs<=h){
                rate=Math.min(rate,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return rate;
    }
    static long hours(int piles[],int rate){
        long hrs=0l;
        for(int i=0;i<piles.length;i++){
           hrs+=(long)Math.ceil((double)piles[i]/rate);
        }
        return hrs;
    }
}