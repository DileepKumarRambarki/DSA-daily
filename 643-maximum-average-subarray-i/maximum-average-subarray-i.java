class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res=Integer.MIN_VALUE;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        res=Math.max(res,sum/k);
        int l=0,r=k;
        while(r<nums.length){
            sum+=nums[r];
            sum-=nums[l];
            res=Math.max(res,sum/k);
            r++;
            l++;
        }
        return res;
    }
}