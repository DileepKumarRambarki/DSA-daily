class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i:nums){
            if(i>max) max=i;
        }
        int low=1;
        int high=max;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=sum(nums,mid);
            if(sum<=threshold){
                res=mid;
                high=mid-1;
            }
            else{ low=mid+1;}
        }
        return res;
    }
    static int sum(int nums[],int div){
        int sum=0;
        for(int i:nums){
            sum+=(int)Math.ceil((double)i/div);
        }
        return sum;
    }
}