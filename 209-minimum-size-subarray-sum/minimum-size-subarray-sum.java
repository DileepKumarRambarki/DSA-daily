class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int res=Integer.MAX_VALUE;
        int sum=0;
        for(r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                res=Math.min(res,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
       res=res==Integer.MAX_VALUE?0:res;
        return res;
    }
}