class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int prefsum=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:nums){
            sum+=i;
            // max=Math.max(sum-prefsum,max);
            // prefsum=Math.min(sum,prefsum);
            if(sum<0){
                max=Math.max(max,sum);
                sum=0;
            }
            else{
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}