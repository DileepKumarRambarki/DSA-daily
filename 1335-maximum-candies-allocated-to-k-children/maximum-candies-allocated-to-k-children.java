class Solution {
    public int maximumCandies(int[] candies, long k) {
        long max=0;
        long sum=0;
        long res=0;
        for(long i:candies){
            sum+=i;
            if(i>max){
                max=i;
            }
        }
        if(sum<k) return 0;
        long low=1,high=max;
        while(low<=high){
            long mid=(low+high)/2;
            boolean suff=isSuff(candies,mid,k);
            if(suff){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)res;
    }
    boolean isSuff(int nums[],long n,long k){
        long count=0;
        for(long i:nums){
            count+=i/n;
            if(count>=k){
                return true;
            }
        }
        return false;
    }
}