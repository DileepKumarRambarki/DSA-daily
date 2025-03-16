class Solution {
    public long repairCars(int[] ranks, int cars) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i:ranks){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        long low=min;
        long high=(long) 1e14;
        long res=0;
        while(low<=high){
            long mid=(low+high)/2;
            boolean mins=canRepair(ranks,mid,cars);
            if(mins){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    boolean canRepair(int nums[],long time,long cars){
        long count=0;
        for(int i:nums){
           count+=(int)Math.sqrt(time/i);
           if(count>=cars) return true;
        }
        return false;
    }
}